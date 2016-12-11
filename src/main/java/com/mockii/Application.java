package com.mockii;

/**
 * Created by Billa on 12/3/16.
 */
import java.io.IOException;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

@SpringBootApplication
@EntityScan(basePackages = "com.mockii.entity")
public class Application {

    public static void main(String[] args) throws Exception{

        String fixieUrl = System.getenv("FIXIE_URL");

        String[] fixieValues = fixieUrl.split("[/(:\\/@)/]+");
        String fixieUser = fixieValues[1];
        String fixiePassword = fixieValues[2];
        String fixieHost = fixieValues[3];
        int fixiePort = Integer.parseInt(fixieValues[4]);

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope(fixieHost, fixiePort),
                new UsernamePasswordCredentials(fixieUser, fixiePassword));
        CloseableHttpClient httpclient = HttpClients.custom()
                .setDefaultCredentialsProvider(credsProvider).build();
        try {
            HttpHost proxy = new HttpHost(fixieHost, fixiePort);
            RequestConfig config = RequestConfig.custom()
                    .setProxy(proxy)
                    .build();

            HttpHost target = new HttpHost("http://mockii.herokuapp.com", 80, "http");
            HttpGet httpget = new HttpGet("/");
            httpget.setConfig(config);

            CloseableHttpResponse response = httpclient.execute(target, httpget);
            try {
                System.out.println(EntityUtils.toString(response.getEntity()));

                ApplicationContext ctx = SpringApplication.run(Application.class, args);

                System.out.println("Let's inspect the beans provided by Spring Boot:");

                String[] beanNames = ctx.getBeanDefinitionNames();
                Arrays.sort(beanNames);
                for (String beanName : beanNames) {
                    System.out.println(beanName);
                }
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
    }

}