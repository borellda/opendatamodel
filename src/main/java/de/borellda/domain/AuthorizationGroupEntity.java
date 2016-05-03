package de.borellda.domain;

import javax.persistence.*;
import java.sql.Timestamp;

import de.borellda.domain.base.CoreEntity;
import org.slf4j.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "authorization_group", schema = "public", catalog = "ecodp")
public class AuthorizationGroupEntity extends CoreEntity{
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(AuthorizationGroupEntity.class.getSimpleName());

    private String name;
    private Timestamp created;



    @Basic
    @Column(name = "name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)){
            return false;
        }

        AuthorizationGroupEntity that = (AuthorizationGroupEntity) o;


        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = ((result << 5) - result) + name.hashCode();
        result = ((result << 5) - result) + name.hashCode();
        return result;
    }
}
