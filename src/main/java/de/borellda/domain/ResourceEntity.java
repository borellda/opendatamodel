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
@javax.persistence.Table(name = "resource", schema = "public", catalog = "ecodp")
public class ResourceEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(ResourceEntity.class);
    private String id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String resourceGroupId;

    @Basic
    @javax.persistence.Column(name = "resource_group_id", nullable = true, length = -1)
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    private String url;

    @Basic
    @javax.persistence.Column(name = "url", nullable = false, length = -1)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String format;

    @Basic
    @javax.persistence.Column(name = "format", nullable = true, length = -1)
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    private String description;

    @Basic
    @javax.persistence.Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Serializable position;

    @Basic
    @javax.persistence.Column(name = "position", nullable = true)
    public Serializable getPosition() {
        return position;
    }

    public void setPosition(Serializable position) {
        this.position = position;
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

    private String hash;

    @Basic
    @javax.persistence.Column(name = "hash", nullable = true, length = -1)
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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

    private String extras;

    @Basic
    @javax.persistence.Column(name = "extras", nullable = true, length = -1)
    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String resourceType;

    @Basic
    @javax.persistence.Column(name = "resource_type", nullable = true, length = -1)
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    private String mimetype;

    @Basic
    @javax.persistence.Column(name = "mimetype", nullable = true, length = -1)
    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    private String mimetypeInner;

    @Basic
    @javax.persistence.Column(name = "mimetype_inner", nullable = true, length = -1)
    public String getMimetypeInner() {
        return mimetypeInner;
    }

    public void setMimetypeInner(String mimetypeInner) {
        this.mimetypeInner = mimetypeInner;
    }

    private Long size;

    @Basic
    @javax.persistence.Column(name = "size", nullable = true)
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    private Timestamp lastModified;

    @Basic
    @javax.persistence.Column(name = "last_modified", nullable = true)
    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }

    private String cacheUrl;

    @Basic
    @javax.persistence.Column(name = "cache_url", nullable = true, length = -1)
    public String getCacheUrl() {
        return cacheUrl;
    }

    public void setCacheUrl(String cacheUrl) {
        this.cacheUrl = cacheUrl;
    }

    private Timestamp cacheLastUpdated;

    @Basic
    @javax.persistence.Column(name = "cache_last_updated", nullable = true)
    public Timestamp getCacheLastUpdated() {
        return cacheLastUpdated;
    }

    public void setCacheLastUpdated(Timestamp cacheLastUpdated) {
        this.cacheLastUpdated = cacheLastUpdated;
    }

    private String webstoreUrl;

    @Basic
    @javax.persistence.Column(name = "webstore_url", nullable = true, length = -1)
    public String getWebstoreUrl() {
        return webstoreUrl;
    }

    public void setWebstoreUrl(String webstoreUrl) {
        this.webstoreUrl = webstoreUrl;
    }

    private Timestamp webstoreLastUpdated;

    @Basic
    @javax.persistence.Column(name = "webstore_last_updated", nullable = true)
    public Timestamp getWebstoreLastUpdated() {
        return webstoreLastUpdated;
    }

    public void setWebstoreLastUpdated(Timestamp webstoreLastUpdated) {
        this.webstoreLastUpdated = webstoreLastUpdated;
    }

    private Timestamp created;

    @Basic
    @javax.persistence.Column(name = "created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    private String urlType;

    @Basic
    @javax.persistence.Column(name = "url_type", nullable = true, length = -1)
    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceEntity that = (ResourceEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (resourceGroupId != null ? !resourceGroupId.equals(that.resourceGroupId) : that.resourceGroupId != null)
            return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;
        if (hash != null ? !hash.equals(that.hash) : that.hash != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (extras != null ? !extras.equals(that.extras) : that.extras != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (resourceType != null ? !resourceType.equals(that.resourceType) : that.resourceType != null) return false;
        if (mimetype != null ? !mimetype.equals(that.mimetype) : that.mimetype != null) return false;
        if (mimetypeInner != null ? !mimetypeInner.equals(that.mimetypeInner) : that.mimetypeInner != null)
            return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (lastModified != null ? !lastModified.equals(that.lastModified) : that.lastModified != null) return false;
        if (cacheUrl != null ? !cacheUrl.equals(that.cacheUrl) : that.cacheUrl != null) return false;
        if (cacheLastUpdated != null ? !cacheLastUpdated.equals(that.cacheLastUpdated) : that.cacheLastUpdated != null)
            return false;
        if (webstoreUrl != null ? !webstoreUrl.equals(that.webstoreUrl) : that.webstoreUrl != null) return false;
        if (webstoreLastUpdated != null ? !webstoreLastUpdated.equals(that.webstoreLastUpdated) : that.webstoreLastUpdated != null)
            return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (urlType != null ? !urlType.equals(that.urlType) : that.urlType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (resourceGroupId != null ? resourceGroupId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        result = 31 * result + (hash != null ? hash.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (extras != null ? extras.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (resourceType != null ? resourceType.hashCode() : 0);
        result = 31 * result + (mimetype != null ? mimetype.hashCode() : 0);
        result = 31 * result + (mimetypeInner != null ? mimetypeInner.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (lastModified != null ? lastModified.hashCode() : 0);
        result = 31 * result + (cacheUrl != null ? cacheUrl.hashCode() : 0);
        result = 31 * result + (cacheLastUpdated != null ? cacheLastUpdated.hashCode() : 0);
        result = 31 * result + (webstoreUrl != null ? webstoreUrl.hashCode() : 0);
        result = 31 * result + (webstoreLastUpdated != null ? webstoreLastUpdated.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (urlType != null ? urlType.hashCode() : 0);
        return result;
    }
}
