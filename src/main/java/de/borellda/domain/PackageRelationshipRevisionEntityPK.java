package de.borellda.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by borellda on 2/24/2016.
 */
public class PackageRelationshipRevisionEntityPK implements Serializable {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(PackageRelationshipRevisionEntityPK.class);
    private String id;
    private String revisionId;

    @Column(name = "id", nullable = false, length = -1)
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "revision_id", nullable = false, length = -1)
    @Id
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

        PackageRelationshipRevisionEntityPK that = (PackageRelationshipRevisionEntityPK) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        return result;
    }
}
