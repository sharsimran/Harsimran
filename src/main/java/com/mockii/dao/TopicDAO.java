package com.mockii.dao;

/**
 * Created by Billa on 12/4/16.
 */

import javax.transaction.Transactional;

import com.mockii.entity.Topic;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface TopicDAO extends CrudRepository<Topic, Long> {

    /**
     * Return the Topic having the passed name or null if no topic is found.
     *
     * @param topic
     */
    Topic findByTopic(String topic);
    Topic findByTopicId(int ind);
}