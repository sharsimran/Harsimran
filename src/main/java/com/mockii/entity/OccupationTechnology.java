package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "OCCUPATIONS_TECHNOLOGY", schema = "MOCKII")
public class OccupationTechnology {

    @Basic
    @Column(name = "OCCUPATION_ID")
    @Getter
    @Setter
    private int occupationId;

    @Basic
    @Column(name = "TECHNOLOGY_ID")
    @Getter
    @Setter
    private int technologyId;

    @Id
    @Column(name = "OCC_TECH_ID")
    @Getter
    @Setter
    private int occTechId;

    public OccupationTechnology() {
    }
}
