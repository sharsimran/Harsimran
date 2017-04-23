package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "SKILLSET", schema = "MOCKII")
public class Skillset {

    @Id
    @Column(name = "SKILL_SET_ID")
    @Getter
    @Setter
    private int skillSetId;

    @Basic
    @Column(name = "INTERVIEW_ID")
    @Getter
    @Setter
    private int interviewId;

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

    public Skillset() {
    }
}