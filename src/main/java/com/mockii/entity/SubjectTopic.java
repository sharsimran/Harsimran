package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "SUBJECT_TOPIC", schema = "MOCKII")
public class SubjectTopic {

    @Basic
    @Column(name = "SUBJECT_ID")
    @Getter
    @Setter
    private int subjectId;

    @Basic
    @Column(name = "TOPIC_ID")

    @Getter
    @Setter
    private int topicId;

    @Id
    @Column(name = "SUBJECT_TOPIC_ID")
    @Getter
    @Setter
    private int subjectTopicId;

    public SubjectTopic() {
    }
}
