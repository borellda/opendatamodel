package de.borellda.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "dashboard", schema = "public", catalog = "ecodp")
public class DashboardEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(DashboardEntity.class);
    private String userId;
    private Timestamp activityStreamLastViewed;
    private Timestamp emailLastSent;

    @Id
    @Column(name = "user_id", nullable = false, length = -1)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "activity_stream_last_viewed", nullable = false)
    public Timestamp getActivityStreamLastViewed() {
        return activityStreamLastViewed;
    }

    public void setActivityStreamLastViewed(Timestamp activityStreamLastViewed) {
        this.activityStreamLastViewed = activityStreamLastViewed;
    }

    @Basic
    @Column(name = "email_last_sent", nullable = false)
    public Timestamp getEmailLastSent() {
        return emailLastSent;
    }

    public void setEmailLastSent(Timestamp emailLastSent) {
        this.emailLastSent = emailLastSent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DashboardEntity that = (DashboardEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (activityStreamLastViewed != null ? !activityStreamLastViewed.equals(that.activityStreamLastViewed) : that.activityStreamLastViewed != null)
            return false;
        if (emailLastSent != null ? !emailLastSent.equals(that.emailLastSent) : that.emailLastSent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (activityStreamLastViewed != null ? activityStreamLastViewed.hashCode() : 0);
        result = 31 * result + (emailLastSent != null ? emailLastSent.hashCode() : 0);
        return result;
    }
}
