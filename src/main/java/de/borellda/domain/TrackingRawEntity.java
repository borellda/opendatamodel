package de.borellda.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "tracking_raw", schema = "public", catalog = "ecodp")
public class TrackingRawEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(TrackingRawEntity.class);
    private String userKey;
    private String url;
    private String trackingType;
    private Timestamp accessTimestamp;

    @Basic
    @Column(name = "user_key", nullable = false, length = 100)
    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    @Basic
    @Column(name = "url", nullable = false, length = -1)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "tracking_type", nullable = false, length = 10)
    public String getTrackingType() {
        return trackingType;
    }

    public void setTrackingType(String trackingType) {
        this.trackingType = trackingType;
    }

    @Basic
    @Column(name = "access_timestamp", nullable = true)
    public Timestamp getAccessTimestamp() {
        return accessTimestamp;
    }

    public void setAccessTimestamp(Timestamp accessTimestamp) {
        this.accessTimestamp = accessTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrackingRawEntity that = (TrackingRawEntity) o;

        if (userKey != null ? !userKey.equals(that.userKey) : that.userKey != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (trackingType != null ? !trackingType.equals(that.trackingType) : that.trackingType != null) return false;
        if (accessTimestamp != null ? !accessTimestamp.equals(that.accessTimestamp) : that.accessTimestamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userKey != null ? userKey.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (trackingType != null ? trackingType.hashCode() : 0);
        result = 31 * result + (accessTimestamp != null ? accessTimestamp.hashCode() : 0);
        return result;
    }
}
