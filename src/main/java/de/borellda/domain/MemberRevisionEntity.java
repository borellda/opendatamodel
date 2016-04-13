package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "member_revision", schema = "public", catalog = "ecodp")
@IdClass(MemberRevisionEntityPK.class)
public class MemberRevisionEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(MemberRevisionEntity.class);
    private String id;
    private String tableId;
    private String groupId;
    private String state;
    private String revisionId;
    private String continuityId;
    private String expiredId;
    private Timestamp revisionTimestamp;
    private Timestamp expiredTimestamp;
    private Serializable current;
    private String tableName;
    private String capacity;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "table_id", nullable = false, length = -1)
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "group_id", nullable = true, length = -1)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "state", nullable = true, length = -1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Id
    @Column(name = "revision_id", nullable = false, length = -1)
    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    @Basic
    @Column(name = "continuity_id", nullable = true, length = -1)
    public String getContinuityId() {
        return continuityId;
    }

    public void setContinuityId(String continuityId) {
        this.continuityId = continuityId;
    }

    @Basic
    @Column(name = "expired_id", nullable = true, length = -1)
    public String getExpiredId() {
        return expiredId;
    }

    public void setExpiredId(String expiredId) {
        this.expiredId = expiredId;
    }

    @Basic
    @Column(name = "revision_timestamp", nullable = true)
    public Timestamp getRevisionTimestamp() {
        return revisionTimestamp;
    }

    public void setRevisionTimestamp(Timestamp revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    @Basic
    @Column(name = "expired_timestamp", nullable = true)
    public Timestamp getExpiredTimestamp() {
        return expiredTimestamp;
    }

    public void setExpiredTimestamp(Timestamp expiredTimestamp) {
        this.expiredTimestamp = expiredTimestamp;
    }

    @Basic
    @Column(name = "current", nullable = true)
    public Serializable getCurrent() {
        return current;
    }

    public void setCurrent(Serializable current) {
        this.current = current;
    }

    @Basic
    @Column(name = "table_name", nullable = false, length = -1)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "capacity", nullable = false, length = -1)
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberRevisionEntity that = (MemberRevisionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;
        if (continuityId != null ? !continuityId.equals(that.continuityId) : that.continuityId != null) return false;
        if (expiredId != null ? !expiredId.equals(that.expiredId) : that.expiredId != null) return false;
        if (revisionTimestamp != null ? !revisionTimestamp.equals(that.revisionTimestamp) : that.revisionTimestamp != null)
            return false;
        if (expiredTimestamp != null ? !expiredTimestamp.equals(that.expiredTimestamp) : that.expiredTimestamp != null)
            return false;
        if (current != null ? !current.equals(that.current) : that.current != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tableId != null ? tableId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        result = 31 * result + (continuityId != null ? continuityId.hashCode() : 0);
        result = 31 * result + (expiredId != null ? expiredId.hashCode() : 0);
        result = 31 * result + (revisionTimestamp != null ? revisionTimestamp.hashCode() : 0);
        result = 31 * result + (expiredTimestamp != null ? expiredTimestamp.hashCode() : 0);
        result = 31 * result + (current != null ? current.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        return result;
    }
}
