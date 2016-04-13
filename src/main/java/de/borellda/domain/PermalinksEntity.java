package de.borellda.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "permalinks", schema = "public", catalog = "ecodp")
public class PermalinksEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(PermalinksEntity.class);
    private String linkHash;
    private String ip;
    private String state;
    private Timestamp time;

    @Id
    @Column(name = "link_hash", nullable = false, length = -1)
    public String getLinkHash() {
        return linkHash;
    }

    public void setLinkHash(String linkHash) {
        this.linkHash = linkHash;
    }

    @Basic
    @Column(name = "ip", nullable = false, length = -1)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "state", nullable = false, length = -1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PermalinksEntity that = (PermalinksEntity) o;

        if (linkHash != null ? !linkHash.equals(that.linkHash) : that.linkHash != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = linkHash != null ? linkHash.hashCode() : 0;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
