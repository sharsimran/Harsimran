package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "TECHNOLOGIES", schema = "MOCKII")
public class Technologies {

    @Id
    @Column(name = "TECHNOLOGY_ID")
    @Getter
    @Setter
    private int technologyId;

    @Basic
    @Column(name = "TECHNOLOGY")
    @Getter
    @Setter
    private String technology;

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

    public Technologies() {
    }
}
