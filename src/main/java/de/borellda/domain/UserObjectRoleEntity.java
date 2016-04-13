package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "user_object_role", schema = "public", catalog = "ecodp")
public class UserObjectRoleEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(UserObjectRoleEntity.class);
    private String id;
    private String userId;
    private String context;
    private String role;
    private String authorizedGroupId;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = true, length = -1)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "context", nullable = false, length = -1)
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Basic
    @Column(name = "role", nullable = true, length = -1)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "authorized_group_id", nullable = true, length = -1)
    public String getAuthorizedGroupId() {
        return authorizedGroupId;
    }

    public void setAuthorizedGroupId(String authorizedGroupId) {
        this.authorizedGroupId = authorizedGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserObjectRoleEntity that = (UserObjectRoleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (authorizedGroupId != null ? !authorizedGroupId.equals(that.authorizedGroupId) : that.authorizedGroupId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (authorizedGroupId != null ? authorizedGroupId.hashCode() : 0);
        return result;
    }
}
