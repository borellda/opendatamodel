package de.borellda.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "query_cache", schema = "public", catalog = "ecodp")
public class QueryCacheEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(QueryCacheEntity.class);
    private byte[] queryHash;
    private String queryString;
    private byte[] data;
    private Timestamp time;

    @Id
    @Column(name = "query_hash", nullable = false)
    public byte[] getQueryHash() {
        return queryHash;
    }

    public void setQueryHash(byte[] queryHash) {
        this.queryHash = queryHash;
    }

    @Basic
    @Column(name = "query_string", nullable = true, length = 16383)
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    @Basic
    @Column(name = "data", nullable = true)
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
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

        QueryCacheEntity that = (QueryCacheEntity) o;

        if (!Arrays.equals(queryHash, that.queryHash)) return false;
        if (queryString != null ? !queryString.equals(that.queryString) : that.queryString != null) return false;
        if (!Arrays.equals(data, that.data)) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(queryHash);
        result = 31 * result + (queryString != null ? queryString.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(data);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
