package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "kombu_queue", schema = "public", catalog = "ecodp")
public class KombuQueueEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(KombuQueueEntity.class);
    private Serializable id;
    private String name;

    @Id
    @Column(name = "id", nullable = false)
    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KombuQueueEntity that = (KombuQueueEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
