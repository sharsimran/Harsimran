package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "OCCUPATIONS", schema = "MOCKII")
public class Occupations {

    @Basic
    @Column(name = "OCCUPATION")
    @Getter
    @Setter
    private String occupation;

    @Id
    @Column(name = "OCCUPATION_ID")
    @Getter
    @Setter
    private int occupationId;

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

    public Occupations() {
    }
}
