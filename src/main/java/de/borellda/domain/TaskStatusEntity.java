package de.borellda.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "task_status", schema = "public", catalog = "ecodp")
public class TaskStatusEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(TaskStatusEntity.class);
    private String id;
    private String entityId;
    private String entityType;
    private String taskType;
    private String key;
    private String value;
    private String state;
    private String error;
    private Timestamp lastUpdated;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "entity_id", nullable = false, length = -1)
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Basic
    @Column(name = "entity_type", nullable = false, length = -1)
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @Basic
    @Column(name = "task_type", nullable = false, length = -1)
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Basic
    @Column(name = "key", nullable = false, length = -1)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "value", nullable = false, length = -1)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "state", nullable = true, length = -1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "error", nullable = true, length = -1)
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Basic
    @Column(name = "last_updated", nullable = true)
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskStatusEntity that = (TaskStatusEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (entityId != null ? !entityId.equals(that.entityId) : that.entityId != null) return false;
        if (entityType != null ? !entityType.equals(that.entityType) : that.entityType != null) return false;
        if (taskType != null ? !taskType.equals(that.taskType) : that.taskType != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (error != null ? !error.equals(that.error) : that.error != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (entityId != null ? entityId.hashCode() : 0);
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        result = 31 * result + (taskType != null ? taskType.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (error != null ? error.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        return result;
    }
}
