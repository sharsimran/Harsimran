package com.mockii.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Billa on 12/11/16.
 */
@Entity
@Table(name = "INTERVIEWS")
public class Interviews {
    private int interviewId;
    private Timestamp interviewDate;
    private int intervieweeId;
    private int interviewerId;
    private String overallInterviewerRating;
    private String overallIntervieweeRating;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "INTERVIEW_ID")
    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    @Basic
    @Column(name = "INTERVIEW_DATE")
    public Timestamp getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Timestamp interviewDate) {
        this.interviewDate = interviewDate;
    }

    @Basic
    @Column(name = "INTERVIEWEE_ID")
    public int getIntervieweeId() {
        return intervieweeId;
    }

    public void setIntervieweeId(int intervieweeId) {
        this.intervieweeId = intervieweeId;
    }

    @Basic
    @Column(name = "INTERVIEWER_ID")
    public int getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(int interviewerId) {
        this.interviewerId = interviewerId;
    }

    @Basic
    @Column(name = "OVERALL_INTERVIEWER_RATING")
    public String getOverallInterviewerRating() {
        return overallInterviewerRating;
    }

    public void setOverallInterviewerRating(String overallInterviewerRating) {
        this.overallInterviewerRating = overallInterviewerRating;
    }

    @Basic
    @Column(name = "OVERALL_INTERVIEWEE_RATING")
    public String getOverallIntervieweeRating() {
        return overallIntervieweeRating;
    }

    public void setOverallIntervieweeRating(String overallIntervieweeRating) {
        this.overallIntervieweeRating = overallIntervieweeRating;
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

        Interviews that = (Interviews) o;

        if (interviewId != that.interviewId) return false;
        if (intervieweeId != that.intervieweeId) return false;
        if (interviewerId != that.interviewerId) return false;
        if (interviewDate != null ? !interviewDate.equals(that.interviewDate) : that.interviewDate != null)
            return false;
        if (overallInterviewerRating != null ? !overallInterviewerRating.equals(that.overallInterviewerRating) : that.overallInterviewerRating != null)
            return false;
        if (overallIntervieweeRating != null ? !overallIntervieweeRating.equals(that.overallIntervieweeRating) : that.overallIntervieweeRating != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = interviewId;
        result = 31 * result + (interviewDate != null ? interviewDate.hashCode() : 0);
        result = 31 * result + intervieweeId;
        result = 31 * result + interviewerId;
        result = 31 * result + (overallInterviewerRating != null ? overallInterviewerRating.hashCode() : 0);
        result = 31 * result + (overallIntervieweeRating != null ? overallIntervieweeRating.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Interviews{" +
                "interviewId=" + interviewId +
                ", interviewDate=" + interviewDate +
                ", intervieweeId=" + intervieweeId +
                ", interviewerId=" + interviewerId +
                ", overallInterviewerRating='" + overallInterviewerRating + '\'' +
                ", overallIntervieweeRating='" + overallIntervieweeRating + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
