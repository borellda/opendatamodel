package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "authorization_group_user", schema = "public", catalog = "ecodp")
public class AuthorizationGroupUserEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(AuthorizationGroupUserEntity.class);
    private String authorizationGroupId;
    private String userId;
    private String id;

    @Basic
    @Column(name = "authorization_group_id", nullable = false, length = -1)
    public String getAuthorizationGroupId() {
        return authorizationGroupId;
    }

    public void setAuthorizationGroupId(String authorizationGroupId) {
        this.authorizationGroupId = authorizationGroupId;
    }

    @Basic
    @Column(name = "user_id", nullable = false, length = -1)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorizationGroupUserEntity that = (AuthorizationGroupUserEntity) o;

        if (authorizationGroupId != null ? !authorizationGroupId.equals(that.authorizationGroupId) : that.authorizationGroupId != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorizationGroupId != null ? authorizationGroupId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
