package com.mockii.entity;

import javax.persistence.*;

/**
 * Created by Billa on 12/11/16.
 */
@Entity
@Table(name = "TECHNOLOGY_SUBJECT", schema = "MOCKII")
public class TechnologySubject {
    private int technologyId;
    private int subjectId;
    private int techsSubsId;

    @Basic
    @Column(name = "TECHNOLOGY_ID")
    public int getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(int technologyId) {
        this.technologyId = technologyId;
    }

    @Basic
    @Column(name = "SUBJECT_ID")
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Id
    @Column(name = "TECHS_SUBS_ID")
    public int getTechsSubsId() {
        return techsSubsId;
    }

    public void setTechsSubsId(int techsSubsId) {
        this.techsSubsId = techsSubsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TechnologySubject that = (TechnologySubject) o;

        if (technologyId != that.technologyId) return false;
        if (subjectId != that.subjectId) return false;
        if (techsSubsId != that.techsSubsId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = technologyId;
        result = 31 * result + subjectId;
        result = 31 * result + techsSubsId;
        return result;
    }
}
