package de.borellda.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "activity_detail", schema = "public", catalog = "ecodp")
public class ActivityDetailEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(ActivityDetailEntity.class);
    private String id;
    private String activityId;
    private String objectId;
    private String objectType;
    private String activityType;
    private String data;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "activity_id", nullable = true, length = -1)
    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    @Basic
    @Column(name = "object_id", nullable = true, length = -1)
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "object_type", nullable = true, length = -1)
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Basic
    @Column(name = "activity_type", nullable = true, length = -1)
    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @Basic
    @Column(name = "data", nullable = true, length = -1)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityDetailEntity that = (ActivityDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (activityId != null ? !activityId.equals(that.activityId) : that.activityId != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (objectType != null ? !objectType.equals(that.objectType) : that.objectType != null) return false;
        if (activityType != null ? !activityType.equals(that.activityType) : that.activityType != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (activityId != null ? activityId.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (objectType != null ? objectType.hashCode() : 0);
        result = 31 * result + (activityType != null ? activityType.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
