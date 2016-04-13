package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "package_relationship_revision", schema = "public", catalog = "ecodp")
@IdClass(PackageRelationshipRevisionEntityPK.class)
public class PackageRelationshipRevisionEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(PackageRelationshipRevisionEntity.class);
    private String id;
    private String subjectPackageId;
    private String objectPackageId;
    private String type;
    private String comment;
    private String revisionId;
    private String continuityId;
    private String state;
    private String expiredId;
    private Timestamp revisionTimestamp;
    private Timestamp expiredTimestamp;
    private Serializable current;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subject_package_id", nullable = true, length = -1)
    public String getSubjectPackageId() {
        return subjectPackageId;
    }

    public void setSubjectPackageId(String subjectPackageId) {
        this.subjectPackageId = subjectPackageId;
    }

    @Basic
    @Column(name = "object_package_id", nullable = true, length = -1)
    public String getObjectPackageId() {
        return objectPackageId;
    }

    public void setObjectPackageId(String objectPackageId) {
        this.objectPackageId = objectPackageId;
    }

    @Basic
    @Column(name = "type", nullable = true, length = -1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = -1)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
    @Column(name = "continuity_id", nullable = true, length = -1)
    public String getContinuityId() {
        return continuityId;
    }

    public void setContinuityId(String continuityId) {
        this.continuityId = continuityId;
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
    @Column(name = "expired_id", nullable = true, length = -1)
    public String getExpiredId() {
        return expiredId;
    }

    public void setExpiredId(String expiredId) {
        this.expiredId = expiredId;
    }

    @Basic
    @Column(name = "revision_timestamp", nullable = true)
    public Timestamp getRevisionTimestamp() {
        return revisionTimestamp;
    }

    public void setRevisionTimestamp(Timestamp revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    @Basic
    @Column(name = "expired_timestamp", nullable = true)
    public Timestamp getExpiredTimestamp() {
        return expiredTimestamp;
    }

    public void setExpiredTimestamp(Timestamp expiredTimestamp) {
        this.expiredTimestamp = expiredTimestamp;
    }

    @Basic
    @Column(name = "current", nullable = true)
    public Serializable getCurrent() {
        return current;
    }

    public void setCurrent(Serializable current) {
        this.current = current;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageRelationshipRevisionEntity that = (PackageRelationshipRevisionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (subjectPackageId != null ? !subjectPackageId.equals(that.subjectPackageId) : that.subjectPackageId != null)
            return false;
        if (objectPackageId != null ? !objectPackageId.equals(that.objectPackageId) : that.objectPackageId != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;
        if (continuityId != null ? !continuityId.equals(that.continuityId) : that.continuityId != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (expiredId != null ? !expiredId.equals(that.expiredId) : that.expiredId != null) return false;
        if (revisionTimestamp != null ? !revisionTimestamp.equals(that.revisionTimestamp) : that.revisionTimestamp != null)
            return false;
        if (expiredTimestamp != null ? !expiredTimestamp.equals(that.expiredTimestamp) : that.expiredTimestamp != null)
            return false;
        if (current != null ? !current.equals(that.current) : that.current != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (subjectPackageId != null ? subjectPackageId.hashCode() : 0);
        result = 31 * result + (objectPackageId != null ? objectPackageId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        result = 31 * result + (continuityId != null ? continuityId.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (expiredId != null ? expiredId.hashCode() : 0);
        result = 31 * result + (revisionTimestamp != null ? revisionTimestamp.hashCode() : 0);
        result = 31 * result + (expiredTimestamp != null ? expiredTimestamp.hashCode() : 0);
        result = 31 * result + (current != null ? current.hashCode() : 0);
        return result;
    }
}
