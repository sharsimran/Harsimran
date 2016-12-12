package com.mockii.controller;

/**
 * Created by Billa on 12/3/16.
 */
import com.mockii.dao.TopicDAO;
import com.mockii.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RestController
public class TopicController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Mockii! This is the first app";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String create(String name) {
        Topic topic = null;
        try {
            topic = new Topic(name);
            topic.setCreatedDate(new Date());
            topic.setUpdatedDate(new Date());
            topicDAO.save(topic);
        }
        catch (Exception ex) {
            return "Error creating the topic: " + ex.toString();
        }
        return "Topic successfully created! (id = " + topic.getTopicId() + ")";
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public String findById(int id) {
        Topic topic = null;
        try {
            topic = topicDAO.findByTopicId(id);
        }
        catch (Exception ex) {
            return "Error topic: " + ex.toString();
        }
        return "Topic found! (topic = " + topic.toString() + ")";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(int id) {
        Topic topic = null;
        try {
            topic = topicDAO.findByTopicId(id);
            topicDAO.delete(topic);
        }
        catch (Exception ex) {
            return "Error deleting a topic: " + ex.toString();
        }
        return "Topic delete! (topic = " + topic.toString() + ")";
    }

    @Autowired
    private TopicDAO topicDAO;
}