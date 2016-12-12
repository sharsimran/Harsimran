package com.mockii.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Billa on 12/11/16.
 */
@Entity
@Table(name = "JOB_PROFILE", schema = "MOCKII")
public class JobProfile {
    private int userid;
    private String currentTitle;
    private int jobProfileId;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Basic
    @Column(name = "USERID")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "CURRENT_TITLE")
    public String getCurrentTitle() {
        return currentTitle;
    }

    public void setCurrentTitle(String currentTitle) {
        this.currentTitle = currentTitle;
    }

    @Id
    @Column(name = "JOB_PROFILE_ID")
    public int getJobProfileId() {
        return jobProfileId;
    }

    public void setJobProfileId(int jobProfileId) {
        this.jobProfileId = jobProfileId;
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

        JobProfile that = (JobProfile) o;

        if (userid != that.userid) return false;
        if (jobProfileId != that.jobProfileId) return false;
        if (currentTitle != null ? !currentTitle.equals(that.currentTitle) : that.currentTitle != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + (currentTitle != null ? currentTitle.hashCode() : 0);
        result = 31 * result + jobProfileId;
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JobProfile{" +
                "userid=" + userid +
                ", currentTitle='" + currentTitle + '\'' +
                ", jobProfileId=" + jobProfileId +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
