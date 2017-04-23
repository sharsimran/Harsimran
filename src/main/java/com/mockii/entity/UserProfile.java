package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "USER_PROFILE", schema = "MOCKII")
public class UserProfile {

    @Id
    @Column(name = "USER_ID")
    @Getter
    @Setter
    private int userId;

    @Basic
    @Column(name = "FIRST_NAME")
    @Getter
    @Setter
    private String firstName;

    @Basic
    @Column(name = "MIDDLE_NAME")
    @Getter
    @Setter
    private String middleName;

    @Basic
    @Column(name = "LAST_NAME")
    @Getter
    @Setter
    private String lastName;

    @Basic
    @Column(name = "EMAIL_ID")
    @Getter
    @Setter
    private String emailId;

    @Basic
    @Column(name = "PHONE_NUMBER")
    @Getter
    @Setter
    private String phoneNumber;

    @Basic
    @Column(name = "LAST_ACCESSED")
    @Getter
    @Setter
    private String lastAccessed;

    @Basic
    @Column(name = "DOB")
    @Getter
    @Setter
    private Timestamp dob;

    @Basic
    @Column(name = "ACCOUNT_TYPE")
    @Getter
    @Setter
    private String accountType;

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

    public UserProfile() {
    }
}
