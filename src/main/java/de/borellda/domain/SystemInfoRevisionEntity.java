package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "system_info_revision", schema = "public", catalog = "ecodp")
@IdClass(SystemInfoRevisionEntityPK.class)
public class SystemInfoRevisionEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(SystemInfoRevisionEntity.class);
    private Serializable id;
    private String key;
    private String value;
    private String revisionId;
    private Serializable continuityId;

    @Id
    @Column(name = "id", nullable = false)
    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    @Basic
    @Column(name = "key", nullable = false, length = 100)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "value", nullable = true, length = -1)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Id
    @Column(name = "revision_id", nullable = false, length = -1)
    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    @Basic
    @Column(name = "continuity_id", nullable = true)
    public Serializable getContinuityId() {
        return continuityId;
    }

    public void setContinuityId(Serializable continuityId) {
        this.continuityId = continuityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemInfoRevisionEntity that = (SystemInfoRevisionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;
        if (continuityId != null ? !continuityId.equals(that.continuityId) : that.continuityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        result = 31 * result + (continuityId != null ? continuityId.hashCode() : 0);
        return result;
    }
}
