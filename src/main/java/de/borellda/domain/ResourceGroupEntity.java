package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "resource_group", schema = "public", catalog = "ecodp")
public class ResourceGroupEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(ResourceGroupEntity.class);
    private String id;
    private String packageId;
    private String label;
    private String sortOrder;
    private String extras;
    private String state;
    private String revisionId;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "package_id", nullable = true, length = -1)
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @Basic
    @Column(name = "label", nullable = true, length = -1)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "sort_order", nullable = true, length = -1)
    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "extras", nullable = true, length = -1)
    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceGroupEntity that = (ResourceGroupEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (packageId != null ? !packageId.equals(that.packageId) : that.packageId != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (sortOrder != null ? !sortOrder.equals(that.sortOrder) : that.sortOrder != null) return false;
        if (extras != null ? !extras.equals(that.extras) : that.extras != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (packageId != null ? packageId.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (sortOrder != null ? sortOrder.hashCode() : 0);
        result = 31 * result + (extras != null ? extras.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        return result;
    }
}
