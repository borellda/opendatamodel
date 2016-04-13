package de.borellda.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "tracking_tmp", schema = "public", catalog = "ecodp")
public class TrackingTmpEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(TrackingTmpEntity.class);
    private String url;
    private String userKey;
    private Date trackingDate;
    private String trackingType;

    @Basic
    @Column(name = "url", nullable = true, length = -1)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "user_key", nullable = true, length = 100)
    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    @Basic
    @Column(name = "tracking_date", nullable = true)
    public Date getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(Date trackingDate) {
        this.trackingDate = trackingDate;
    }

    @Basic
    @Column(name = "tracking_type", nullable = true, length = 10)
    public String getTrackingType() {
        return trackingType;
    }

    public void setTrackingType(String trackingType) {
        this.trackingType = trackingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrackingTmpEntity that = (TrackingTmpEntity) o;

        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (userKey != null ? !userKey.equals(that.userKey) : that.userKey != null) return false;
        if (trackingDate != null ? !trackingDate.equals(that.trackingDate) : that.trackingDate != null) return false;
        if (trackingType != null ? !trackingType.equals(that.trackingType) : that.trackingType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (userKey != null ? userKey.hashCode() : 0);
        result = 31 * result + (trackingDate != null ? trackingDate.hashCode() : 0);
        result = 31 * result + (trackingType != null ? trackingType.hashCode() : 0);
        return result;
    }
}
