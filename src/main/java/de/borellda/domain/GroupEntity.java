package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "group", schema = "public", catalog = "ecodp")
public class GroupEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(GroupEntity.class);
    private String id;
    private String name;
    private String title;
    private String description;
    private Timestamp created;
    private String state;
    private String revisionId;
    private String type;
    private String approvalStatus;
    private String imageUrl;
    private Serializable isOrganization;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "title", nullable = true, length = -1)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
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
    @Column(name = "revision_id", nullable = true, length = -1)
    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    @Basic
    @Column(name = "type", nullable = false, length = -1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "approval_status", nullable = true, length = -1)
    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Basic
    @Column(name = "image_url", nullable = true, length = -1)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "is_organization", nullable = true)
    public Serializable getIsOrganization() {
        return isOrganization;
    }

    public void setIsOrganization(Serializable isOrganization) {
        this.isOrganization = isOrganization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupEntity that = (GroupEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (approvalStatus != null ? !approvalStatus.equals(that.approvalStatus) : that.approvalStatus != null)
            return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null) return false;
        if (isOrganization != null ? !isOrganization.equals(that.isOrganization) : that.isOrganization != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (approvalStatus != null ? approvalStatus.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (isOrganization != null ? isOrganization.hashCode() : 0);
        return result;
    }
}
