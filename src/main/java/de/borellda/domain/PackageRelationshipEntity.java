package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "package_relationship", schema = "public", catalog = "ecodp")
public class PackageRelationshipEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(PackageRelationshipEntity.class);
    private String id;
    private String subjectPackageId;
    private String objectPackageId;
    private String type;
    private String comment;
    private String revisionId;
    private String state;

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

    @Basic
    @Column(name = "revision_id", nullable = true, length = -1)
    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    @Basic
    @Column(name = "state", nullable = true, length = -1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageRelationshipEntity that = (PackageRelationshipEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (subjectPackageId != null ? !subjectPackageId.equals(that.subjectPackageId) : that.subjectPackageId != null)
            return false;
        if (objectPackageId != null ? !objectPackageId.equals(that.objectPackageId) : that.objectPackageId != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

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
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
