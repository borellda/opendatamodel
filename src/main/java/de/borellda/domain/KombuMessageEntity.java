package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "kombu_message", schema = "public", catalog = "ecodp")
public class KombuMessageEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(KombuMessageEntity.class);
    private Serializable id;
    private Serializable visible;
    private Timestamp timestamp;
    private String payload;
    private Serializable queueId;
    private Short version;

    @Id
    @Column(name = "id", nullable = false)
    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    @Basic
    @Column(name = "visible", nullable = true)
    public Serializable getVisible() {
        return visible;
    }

    public void setVisible(Serializable visible) {
        this.visible = visible;
    }

    @Basic
    @Column(name = "timestamp", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "payload", nullable = false, length = -1)
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Basic
    @Column(name = "queue_id", nullable = true)
    public Serializable getQueueId() {
        return queueId;
    }

    public void setQueueId(Serializable queueId) {
        this.queueId = queueId;
    }

    @Basic
    @Column(name = "version", nullable = false)
    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KombuMessageEntity that = (KombuMessageEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (visible != null ? !visible.equals(that.visible) : that.visible != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (payload != null ? !payload.equals(that.payload) : that.payload != null) return false;
        if (queueId != null ? !queueId.equals(that.queueId) : that.queueId != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (payload != null ? payload.hashCode() : 0);
        result = 31 * result + (queueId != null ? queueId.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
