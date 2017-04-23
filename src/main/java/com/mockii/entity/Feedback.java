package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "FEEDBACK")
public class Feedback {

    @Id
    @Column(name = "FEEDBACK_ID")
    @Getter
    @Setter

    private int feedbackId;

    @Basic
    @Column(name = "INTERVIEW_ID")
    @Getter
    @Setter
    private int interviewId;

    @Basic
    @Column(name = "RATING")
    @Getter
    @Setter
    private String rating;

    @Basic
    @Column(name = "FEEDBACK")
    @Getter
    @Setter
    private String feedback;

    @Basic
    @Column(name = "SUBJECT_TOPIC_ID")
    @Getter
    @Setter
    private int subjectTopicId;

    @Basic
    @Column(name = "CREATED_DATE")
    @Getter
    @Setter
    private Timestamp createdDate;

    @Basic
    @Column(name = "UPDATED_DATE")
    @Getter
    @Setter
    private Timestamp updatedDate;

    public Feedback() {
    }
}
