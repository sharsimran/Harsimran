package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "MEMBERSHIP", schema = "MOCKII")
public class Membership {

    @Basic
    @Column(name = "USERID")
    @Getter
    @Setter
    private int userid;

    @Basic
    @Column(name = "ACCOUNT_TYPE")
    @Getter
    @Setter

    private String accountType;

    @Basic
    @Column(name = "ACTIVE")
    @Getter
    @Setter
    private String active;

    @Id
    @Column(name = "MEMBERSHIP_ID")
    @Getter
    @Setter
    private int membershipId;

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

    public Membership() {
    }
}