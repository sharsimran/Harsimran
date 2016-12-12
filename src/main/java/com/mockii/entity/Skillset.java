package com.mockii.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Billa on 12/11/16.
 */
@Entity
@Table(name = "SKILLSET", schema = "MOCKII")
public class Skillset {
    private int skillSetId;
    private int interviewId;
    private int subjectTopicId;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "SKILL_SET_ID")
    public int getSkillSetId() {
        return skillSetId;
    }

    public void setSkillSetId(int skillSetId) {
        this.skillSetId = skillSetId;
    }

    @Basic
    @Column(name = "INTERVIEW_ID")
    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    @Basic
    @Column(name = "SUBJECT_TOPIC_ID")
    public int getSubjectTopicId() {
        return subjectTopicId;
    }

    public void setSubjectTopicId(int subjectTopicId) {
        this.subjectTopicId = subjectTopicId;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "UPDATED_DATE")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skillset skillset = (Skillset) o;

        if (skillSetId != skillset.skillSetId) return false;
        if (interviewId != skillset.interviewId) return false;
        if (subjectTopicId != skillset.subjectTopicId) return false;
        if (createdDate != null ? !createdDate.equals(skillset.createdDate) : skillset.createdDate != null)
            return false;
        if (updatedDate != null ? !updatedDate.equals(skillset.updatedDate) : skillset.updatedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = skillSetId;
        result = 31 * result + interviewId;
        result = 31 * result + subjectTopicId;
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Skillset{" +
                "skillSetId=" + skillSetId +
                ", interviewId=" + interviewId +
                ", subjectTopicId=" + subjectTopicId +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}