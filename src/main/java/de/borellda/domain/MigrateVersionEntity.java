package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "migrate_version", schema = "public", catalog = "ecodp")
public class MigrateVersionEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(MigrateVersionEntity.class);
    private String repositoryId;
    private String repositoryPath;
    private Serializable version;

    @Id
    @Column(name = "repository_id", nullable = false, length = 250)
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    @Basic
    @Column(name = "repository_path", nullable = true, length = -1)
    public String getRepositoryPath() {
        return repositoryPath;
    }

    public void setRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
    }

    @Basic
    @Column(name = "version", nullable = true)
    public Serializable getVersion() {
        return version;
    }

    public void setVersion(Serializable version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MigrateVersionEntity that = (MigrateVersionEntity) o;

        if (repositoryId != null ? !repositoryId.equals(that.repositoryId) : that.repositoryId != null) return false;
        if (repositoryPath != null ? !repositoryPath.equals(that.repositoryPath) : that.repositoryPath != null)
            return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repositoryId != null ? repositoryId.hashCode() : 0;
        result = 31 * result + (repositoryPath != null ? repositoryPath.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
