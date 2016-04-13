package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "celery_taskmeta", schema = "public", catalog = "ecodp")
public class CeleryTaskmetaEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(CeleryTaskmetaEntity.class);
    private Serializable id;
    private String taskId;
    private String status;
    private byte[] result;
    private Timestamp dateDone;
    private String traceback;

    @Id
    @Column(name = "id", nullable = false)
    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    @Basic
    @Column(name = "task_id", nullable = true, length = 255)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Basic
    @Column(name = "traceback", nullable = true, length = -1)
    public String getTraceback() {
        return traceback;
    }

    public void setTraceback(String traceback) {
        this.traceback = traceback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CeleryTaskmetaEntity that = (CeleryTaskmetaEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (!Arrays.equals(result, that.result)) return false;
        if (dateDone != null ? !dateDone.equals(that.dateDone) : that.dateDone != null) return false;
        if (traceback != null ? !traceback.equals(that.traceback) : that.traceback != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id != null ? id.hashCode() : 0;
        result1 = 31 * result1 + (taskId != null ? taskId.hashCode() : 0);
        result1 = 31 * result1 + (status != null ? status.hashCode() : 0);
        result1 = 31 * result1 + Arrays.hashCode(result);
        result1 = 31 * result1 + (dateDone != null ? dateDone.hashCode() : 0);
        result1 = 31 * result1 + (traceback != null ? traceback.hashCode() : 0);
        return result1;
    }
}
