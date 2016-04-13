package de.borellda.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "rating", schema = "public", catalog = "ecodp")
public class RatingEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(RatingEntity.class);
    private String id;
    private String userId;
    private String userIpAddress;
    private String packageId;
    private Double rating;
    private Timestamp created;

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
    @Column(name = "user_ip_address", nullable = true, length = -1)
    public String getUserIpAddress() {
        return userIpAddress;
    }

    public void setUserIpAddress(String userIpAddress) {
        this.userIpAddress = userIpAddress;
    }

    @Basic
    @Column(name = "package_id", nullable = true, length = -1)
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @Basic
    @Column(name = "rating", nullable = true, precision = 0)
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingEntity that = (RatingEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (userIpAddress != null ? !userIpAddress.equals(that.userIpAddress) : that.userIpAddress != null)
            return false;
        if (packageId != null ? !packageId.equals(that.packageId) : that.packageId != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (userIpAddress != null ? userIpAddress.hashCode() : 0);
        result = 31 * result + (packageId != null ? packageId.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        return result;
    }
}
