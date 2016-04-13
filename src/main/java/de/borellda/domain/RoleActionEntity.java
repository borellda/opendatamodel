package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "role_action", schema = "public", catalog = "ecodp")
public class RoleActionEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(RoleActionEntity.class);
    private String id;
    private String role;
    private String context;
    private String action;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role", nullable = true, length = -1)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "context", nullable = false, length = -1)
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Basic
    @Column(name = "action", nullable = true, length = -1)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleActionEntity that = (RoleActionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        return result;
    }
}
