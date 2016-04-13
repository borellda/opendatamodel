package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "related_dataset", schema = "public", catalog = "ecodp")
public class RelatedDatasetEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(RelatedDatasetEntity.class);
    private String id;
    private String datasetId;
    private String relatedId;
    private String status;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dataset_id", nullable = false, length = -1)
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    @Basic
    @Column(name = "related_id", nullable = false, length = -1)
    public String getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(String relatedId) {
        this.relatedId = relatedId;
    }

    @Basic
    @Column(name = "status", nullable = true, length = -1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelatedDatasetEntity that = (RelatedDatasetEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (datasetId != null ? !datasetId.equals(that.datasetId) : that.datasetId != null) return false;
        if (relatedId != null ? !relatedId.equals(that.relatedId) : that.relatedId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (datasetId != null ? datasetId.hashCode() : 0);
        result = 31 * result + (relatedId != null ? relatedId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
