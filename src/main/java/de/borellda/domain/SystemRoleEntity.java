package de.borellda.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "system_role", schema = "public", catalog = "ecodp")
public class SystemRoleEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(SystemRoleEntity.class);
    private String userObjectRoleId;

    @Id
    @Column(name = "user_object_role_id", nullable = false, length = -1)
    public String getUserObjectRoleId() {
        return userObjectRoleId;
    }

    public void setUserObjectRoleId(String userObjectRoleId) {
        this.userObjectRoleId = userObjectRoleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemRoleEntity that = (SystemRoleEntity) o;

        if (userObjectRoleId != null ? !userObjectRoleId.equals(that.userObjectRoleId) : that.userObjectRoleId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return userObjectRoleId != null ? userObjectRoleId.hashCode() : 0;
    }
}
