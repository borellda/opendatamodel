package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "group_role", schema = "public", catalog = "ecodp")
public class GroupRoleEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(GroupRoleEntity.class);
    private String userObjectRoleId;
    private String groupId;

    @Id
    @Column(name = "user_object_role_id", nullable = false, length = -1)
    public String getUserObjectRoleId() {
        return userObjectRoleId;
    }

    public void setUserObjectRoleId(String userObjectRoleId) {
        this.userObjectRoleId = userObjectRoleId;
    }

    @Basic
    @Column(name = "group_id", nullable = true, length = -1)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupRoleEntity that = (GroupRoleEntity) o;

        if (userObjectRoleId != null ? !userObjectRoleId.equals(that.userObjectRoleId) : that.userObjectRoleId != null)
            return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userObjectRoleId != null ? userObjectRoleId.hashCode() : 0;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        return result;
    }
}
