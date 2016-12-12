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
import java.util.List;

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

    @RequestMapping(value = "/findAllTopics", method = RequestMethod.GET)
    @ResponseBody
    public List<Topic> findAllTopics(){
        List<Topic> topics;
        try {
            topics = (List<Topic>) topicDAO.findAll();
        }
        catch (Exception ex) {
            throw new RuntimeException("Error topic: " + ex.toString());
        }
        return topics;
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
        return topic.toString();
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