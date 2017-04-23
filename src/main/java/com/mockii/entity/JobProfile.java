package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "JOB_PROFILE", schema = "MOCKII")
public class JobProfile {

    @Basic
    @Column(name = "USERID")
    @Getter
    @Setter

    private int userid;

    @Basic
    @Column(name = "CURRENT_TITLE")
    @Getter
    @Setter
    private String currentTitle;

    @Id
    @Column(name = "JOB_PROFILE_ID")
    @Getter
    @Setter
    private int jobProfileId;

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

    public JobProfile() {
    }
}
