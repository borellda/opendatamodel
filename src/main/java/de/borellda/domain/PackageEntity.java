package de.borellda.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@javax.persistence.Table(name = "package", schema = "public", catalog = "ecodp")
public class PackageEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(PackageEntity.class);
    private String id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String title;

    @Basic
    @javax.persistence.Column(name = "title", nullable = true, length = -1)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String version;

    @Basic
    @javax.persistence.Column(name = "version", nullable = true, length = 100)
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private String url;

    @Basic
    @javax.persistence.Column(name = "url", nullable = true, length = -1)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String notes;

    @Basic
    @javax.persistence.Column(name = "notes", nullable = true, length = -1)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    private String licenseId;

    @Basic
    @javax.persistence.Column(name = "license_id", nullable = true, length = -1)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    private String revisionId;

    @Basic
    @javax.persistence.Column(name = "revision_id", nullable = true, length = -1)
    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    private String author;

    @Basic
    @javax.persistence.Column(name = "author", nullable = true, length = -1)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String authorEmail;

    @Basic
    @javax.persistence.Column(name = "author_email", nullable = true, length = -1)
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    private String maintainer;

    @Basic
    @javax.persistence.Column(name = "maintainer", nullable = true, length = -1)
    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    private String maintainerEmail;

    @Basic
    @javax.persistence.Column(name = "maintainer_email", nullable = true, length = -1)
    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    public void setMaintainerEmail(String maintainerEmail) {
        this.maintainerEmail = maintainerEmail;
    }

    private String state;

    @Basic
    @javax.persistence.Column(name = "state", nullable = true, length = -1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String type;

    @Basic
    @javax.persistence.Column(name = "type", nullable = true, length = -1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String ownerOrg;

    @Basic
    @javax.persistence.Column(name = "owner_org", nullable = true, length = -1)
    public String getOwnerOrg() {
        return ownerOrg;
    }

    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    private Serializable isPrivate;

    @Basic
    @javax.persistence.Column(name = "private", nullable = true)
    public Serializable getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Serializable isPrivate) {
        this.isPrivate = isPrivate;
    }

    private Timestamp metadataModified;

    @Basic
    @javax.persistence.Column(name = "metadata_modified", nullable = true)
    public Timestamp getMetadataModified() {
        return metadataModified;
    }

    public void setMetadataModified(Timestamp metadataModified) {
        this.metadataModified = metadataModified;
    }

    private String creatorUserId;

    @Basic
    @javax.persistence.Column(name = "creator_user_id", nullable = true, length = -1)
    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageEntity that = (PackageEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (authorEmail != null ? !authorEmail.equals(that.authorEmail) : that.authorEmail != null) return false;
        if (maintainer != null ? !maintainer.equals(that.maintainer) : that.maintainer != null) return false;
        if (maintainerEmail != null ? !maintainerEmail.equals(that.maintainerEmail) : that.maintainerEmail != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (ownerOrg != null ? !ownerOrg.equals(that.ownerOrg) : that.ownerOrg != null) return false;
        if (isPrivate != null ? !isPrivate.equals(that.isPrivate) : that.isPrivate != null) return false;
        if (metadataModified != null ? !metadataModified.equals(that.metadataModified) : that.metadataModified != null)
            return false;
        if (creatorUserId != null ? !creatorUserId.equals(that.creatorUserId) : that.creatorUserId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (authorEmail != null ? authorEmail.hashCode() : 0);
        result = 31 * result + (maintainer != null ? maintainer.hashCode() : 0);
        result = 31 * result + (maintainerEmail != null ? maintainerEmail.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (ownerOrg != null ? ownerOrg.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        result = 31 * result + (metadataModified != null ? metadataModified.hashCode() : 0);
        result = 31 * result + (creatorUserId != null ? creatorUserId.hashCode() : 0);
        return result;
    }
}
