package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "INTERVIEWS")
public class Interviews {

    @Id
    @Column(name = "INTERVIEW_ID")
    @Getter
    @Setter
    private int interviewId;

    @Basic
    @Column(name = "INTERVIEW_DATE")

    @Getter
    @Setter
    private Timestamp interviewDate;

    @Basic
    @Column(name = "INTERVIEWEE_ID")
    @Getter
    @Setter
    private int intervieweeId;

    @Basic
    @Column(name = "INTERVIEWER_ID")
    @Getter
    @Setter
    private int interviewerId;

    @Basic
    @Column(name = "OVERALL_INTERVIEWER_RATING")
    @Getter
    @Setter
    private String overallInterviewerRating;

    @Basic
    @Column(name = "OVERALL_INTERVIEWEE_RATING")
    @Getter
    @Setter
    private String overallIntervieweeRating;

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

    public Interviews() {
    }
}
