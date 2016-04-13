package de.borellda.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "revision", schema = "public", catalog = "ecodp")
public class RevisionEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(RevisionEntity.class);
    private String id;
    private Timestamp timestamp;
    private String author;
    private String message;
    private String state;
    private Timestamp approvedTimestamp;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "author", nullable = true, length = 200)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "message", nullable = true, length = -1)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
    @Column(name = "approved_timestamp", nullable = true)
    public Timestamp getApprovedTimestamp() {
        return approvedTimestamp;
    }

    public void setApprovedTimestamp(Timestamp approvedTimestamp) {
        this.approvedTimestamp = approvedTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RevisionEntity that = (RevisionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (approvedTimestamp != null ? !approvedTimestamp.equals(that.approvedTimestamp) : that.approvedTimestamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (approvedTimestamp != null ? approvedTimestamp.hashCode() : 0);
        return result;
    }
}
