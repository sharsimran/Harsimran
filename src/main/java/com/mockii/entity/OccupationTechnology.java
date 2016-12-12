package com.mockii.entity;

import javax.persistence.*;

/**
 * Created by Billa on 12/11/16.
 */
@Entity
@Table(name = "OCCUPATION_TECHNOLOGY", schema = "MOCKII")
public class OccupationTechnology {
    private int occupationId;
    private int technologyId;
    private int occTechId;

    @Basic
    @Column(name = "OCCUPATION_ID")
    public int getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(int occupationId) {
        this.occupationId = occupationId;
    }

    @Basic
    @Column(name = "TECHNOLOGY_ID")
    public int getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(int technologyId) {
        this.technologyId = technologyId;
    }

    @Id
    @Column(name = "OCC_TECH_ID")
    public int getOccTechId() {
        return occTechId;
    }

    public void setOccTechId(int occTechId) {
        this.occTechId = occTechId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OccupationTechnology that = (OccupationTechnology) o;

        if (occupationId != that.occupationId) return false;
        if (technologyId != that.technologyId) return false;
        if (occTechId != that.occTechId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = occupationId;
        result = 31 * result + technologyId;
        result = 31 * result + occTechId;
        return result;
    }
}
