package de.borellda.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "user_following_group", schema = "public", catalog = "ecodp")
@IdClass(UserFollowingGroupEntityPK.class)
public class UserFollowingGroupEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(UserFollowingGroupEntity.class);
    private String followerId;
    private String objectId;
    private Timestamp datetime;

    @Id
    @Column(name = "follower_id", nullable = false, length = -1)
    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }

    @Id
    @Column(name = "object_id", nullable = false, length = -1)
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "datetime", nullable = false)
    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFollowingGroupEntity that = (UserFollowingGroupEntity) o;

        if (followerId != null ? !followerId.equals(that.followerId) : that.followerId != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (datetime != null ? !datetime.equals(that.datetime) : that.datetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = followerId != null ? followerId.hashCode() : 0;
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (datetime != null ? datetime.hashCode() : 0);
        return result;
    }
}
