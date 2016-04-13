package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "group_extra", schema = "public", catalog = "ecodp")
public class GroupExtraEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(GroupExtraEntity.class);
    private String id;
    private String groupId;
    private String key;
    private String value;
    private String state;
    private String revisionId;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "key", nullable = true, length = -1)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "value", nullable = true, length = -1)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "state", nullable = true, length = -1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "revision_id", nullable = true, length = -1)
    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupExtraEntity that = (GroupExtraEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (revisionId != null ? !revisionId.equals(that.revisionId) : that.revisionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (revisionId != null ? revisionId.hashCode() : 0);
        return result;
    }
}
