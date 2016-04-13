package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "celery_tasksetmeta", schema = "public", catalog = "ecodp")
public class CeleryTasksetmetaEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(CeleryTasksetmetaEntity.class);
    private Serializable id;
    private String tasksetId;
    private byte[] result;
    private Timestamp dateDone;

    @Id
    @Column(name = "id", nullable = false)
    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    @Basic
    @Column(name = "taskset_id", nullable = true, length = 255)
    public String getTasksetId() {
        return tasksetId;
    }

    public void setTasksetId(String tasksetId) {
        this.tasksetId = tasksetId;
    }

    @Basic
    @Column(name = "result", nullable = true)
    public byte[] getResult() {
        return result;
    }

    public void setResult(byte[] result) {
        this.result = result;
    }

    @Basic
    @Column(name = "date_done", nullable = true)
    public Timestamp getDateDone() {
        return dateDone;
    }

    public void setDateDone(Timestamp dateDone) {
        this.dateDone = dateDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CeleryTasksetmetaEntity that = (CeleryTasksetmetaEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (tasksetId != null ? !tasksetId.equals(that.tasksetId) : that.tasksetId != null) return false;
        if (!Arrays.equals(result, that.result)) return false;
        if (dateDone != null ? !dateDone.equals(that.dateDone) : that.dateDone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id != null ? id.hashCode() : 0;
        result1 = 31 * result1 + (tasksetId != null ? tasksetId.hashCode() : 0);
        result1 = 31 * result1 + Arrays.hashCode(result);
        result1 = 31 * result1 + (dateDone != null ? dateDone.hashCode() : 0);
        return result1;
    }
}
