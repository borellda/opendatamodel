package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "authorization_group_role", schema = "public", catalog = "ecodp")
public class AuthorizationGroupRoleEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(AuthorizationGroupRoleEntity.class);
    private String userObjectRoleId;
    private String authorizationGroupId;

    @Id
    @Column(name = "user_object_role_id", nullable = false, length = -1)
    public String getUserObjectRoleId() {
        return userObjectRoleId;
    }

    public void setUserObjectRoleId(String userObjectRoleId) {
        this.userObjectRoleId = userObjectRoleId;
    }

    @Basic
    @Column(name = "authorization_group_id", nullable = true, length = -1)
    public String getAuthorizationGroupId() {
        return authorizationGroupId;
    }

    public void setAuthorizationGroupId(String authorizationGroupId) {
        this.authorizationGroupId = authorizationGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorizationGroupRoleEntity that = (AuthorizationGroupRoleEntity) o;

        if (userObjectRoleId != null ? !userObjectRoleId.equals(that.userObjectRoleId) : that.userObjectRoleId != null)
            return false;
        if (authorizationGroupId != null ? !authorizationGroupId.equals(that.authorizationGroupId) : that.authorizationGroupId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userObjectRoleId != null ? userObjectRoleId.hashCode() : 0;
        result = 31 * result + (authorizationGroupId != null ? authorizationGroupId.hashCode() : 0);
        return result;
    }
}
