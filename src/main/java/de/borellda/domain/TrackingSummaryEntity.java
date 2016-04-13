package de.borellda.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "tracking_summary", schema = "public", catalog = "ecodp")
public class TrackingSummaryEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(TrackingSummaryEntity.class);
    private String url;
    private String packageId;
    private String trackingType;
    private Serializable count;
    private Serializable runningTotal;
    private Serializable recentViews;
    private Date trackingDate;

    @Basic
    @Column(name = "url", nullable = false, length = -1)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @Column(name = "tracking_type", nullable = false, length = 10)
    public String getTrackingType() {
        return trackingType;
    }

    public void setTrackingType(String trackingType) {
        this.trackingType = trackingType;
    }

    @Basic
    @Column(name = "count", nullable = false)
    public Serializable getCount() {
        return count;
    }

    public void setCount(Serializable count) {
        this.count = count;
    }

    @Basic
    @Column(name = "running_total", nullable = false)
    public Serializable getRunningTotal() {
        return runningTotal;
    }

    public void setRunningTotal(Serializable runningTotal) {
        this.runningTotal = runningTotal;
    }

    @Basic
    @Column(name = "recent_views", nullable = false)
    public Serializable getRecentViews() {
        return recentViews;
    }

    public void setRecentViews(Serializable recentViews) {
        this.recentViews = recentViews;
    }

    @Basic
    @Column(name = "tracking_date", nullable = true)
    public Date getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(Date trackingDate) {
        this.trackingDate = trackingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrackingSummaryEntity that = (TrackingSummaryEntity) o;

        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (packageId != null ? !packageId.equals(that.packageId) : that.packageId != null) return false;
        if (trackingType != null ? !trackingType.equals(that.trackingType) : that.trackingType != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (runningTotal != null ? !runningTotal.equals(that.runningTotal) : that.runningTotal != null) return false;
        if (recentViews != null ? !recentViews.equals(that.recentViews) : that.recentViews != null) return false;
        if (trackingDate != null ? !trackingDate.equals(that.trackingDate) : that.trackingDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (packageId != null ? packageId.hashCode() : 0);
        result = 31 * result + (trackingType != null ? trackingType.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (runningTotal != null ? runningTotal.hashCode() : 0);
        result = 31 * result + (recentViews != null ? recentViews.hashCode() : 0);
        result = 31 * result + (trackingDate != null ? trackingDate.hashCode() : 0);
        return result;
    }
}
