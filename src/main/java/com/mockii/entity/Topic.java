package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Chouhan on 12/4/16.
 */

@Entity
@Table(name = "TOPIC")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TOPIC_ID")
    @Getter
    @Setter
    private int topicId;

    @Basic
    @Column(name = "TOPIC")
    @Getter
    @Setter
    private String topic;

    @Basic
    @Column(name = "CREATED_DATE")
    @Getter
    @Setter
    private Date createdDate;

    @Basic
    @Column(name = "UPDATED_DATE")
    @Getter
    @Setter
    private Date updatedDate;

    public Topic(int topicId) {
        this.topicId = topicId;
    }

    public Topic(String topic) {
        this.topic = topic;
    }

    public Topic() {
    }
}
