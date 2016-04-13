package de.borellda.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by borellda on 2/24/2016.
 */
public class UserFollowingUserEntityPK implements Serializable {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(UserFollowingUserEntityPK.class);
    private String followerId;
    private String objectId;

    @Column(name = "follower_id", nullable = false, length = -1)
    @Id
    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }

    @Column(name = "object_id", nullable = false, length = -1)
    @Id
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFollowingUserEntityPK that = (UserFollowingUserEntityPK) o;

        if (followerId != null ? !followerId.equals(that.followerId) : that.followerId != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = followerId != null ? followerId.hashCode() : 0;
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        return result;
    }
}
