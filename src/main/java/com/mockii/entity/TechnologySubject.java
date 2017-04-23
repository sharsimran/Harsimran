package com.mockii.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Chouhan on 12/11/16.
 */

@Entity
@Table(name = "TECHNOLOGY_SUBJECT", schema = "MOCKII")
public class TechnologySubject {

    @Basic
    @Column(name = "TECHNOLOGY_ID")
    @Getter
    @Setter
    private int technologyId;

    @Basic
    @Column(name = "SUBJECT_ID")
    @Getter
    @Setter
    private int subjectId;

    @Id
    @Column(name = "TECHS_SUBS_ID")
    @Getter
    @Setter
    private int techsSubsId;

    public TechnologySubject() {
    }
}
