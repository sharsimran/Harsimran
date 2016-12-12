package com.mockii.entity;

import javax.persistence.*;

/**
 * Created by Billa on 12/11/16.
 */
@Entity
@Table(name = "SUBJECT_TOPIC", schema = "MOCKII")
public class SubjectTopic {
    private int subjectId;
    private int topicId;
    private int subjectTopicId;

    @Basic
    @Column(name = "SUBJECT_ID")
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "TOPIC_ID")
    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    @Id
    @Column(name = "SUBJECT_TOPIC_ID")
    public int getSubjectTopicId() {
        return subjectTopicId;
    }

    public void setSubjectTopicId(int subjectTopicId) {
        this.subjectTopicId = subjectTopicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectTopic that = (SubjectTopic) o;

        if (subjectId != that.subjectId) return false;
        if (topicId != that.topicId) return false;
        if (subjectTopicId != that.subjectTopicId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subjectId;
        result = 31 * result + topicId;
        result = 31 * result + subjectTopicId;
        return result;
    }
}
