package de.borellda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "user", schema = "public", catalog = "ecodp")
public class UserEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(UserEntity.class);
    private String id;
    private String name;
    private String apikey;
    private Timestamp created;
    private String about;
    private String openid;
    private String password;
    private String fullname;
    private String email;
    private String resetKey;
    private Serializable sysadmin;
    private Serializable activityStreamsEmailNotifications;
    private String state;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "apikey", nullable = true, length = -1)
    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @Basic
    @Column(name = "created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "about", nullable = true, length = -1)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "openid", nullable = true, length = -1)
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "password", nullable = true, length = -1)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "fullname", nullable = true, length = -1)
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "reset_key", nullable = true, length = -1)
    public String getResetKey() {
        return resetKey;
    }

    public void setResetKey(String resetKey) {
        this.resetKey = resetKey;
    }

    @Basic
    @Column(name = "sysadmin", nullable = true)
    public Serializable getSysadmin() {
        return sysadmin;
    }

    public void setSysadmin(Serializable sysadmin) {
        this.sysadmin = sysadmin;
    }

    @Basic
    @Column(name = "activity_streams_email_notifications", nullable = true)
    public Serializable getActivityStreamsEmailNotifications() {
        return activityStreamsEmailNotifications;
    }

    public void setActivityStreamsEmailNotifications(Serializable activityStreamsEmailNotifications) {
        this.activityStreamsEmailNotifications = activityStreamsEmailNotifications;
    }

    @Basic
    @Column(name = "state", nullable = false, length = -1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (apikey != null ? !apikey.equals(that.apikey) : that.apikey != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (fullname != null ? !fullname.equals(that.fullname) : that.fullname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (resetKey != null ? !resetKey.equals(that.resetKey) : that.resetKey != null) return false;
        if (sysadmin != null ? !sysadmin.equals(that.sysadmin) : that.sysadmin != null) return false;
        if (activityStreamsEmailNotifications != null ? !activityStreamsEmailNotifications.equals(that.activityStreamsEmailNotifications) : that.activityStreamsEmailNotifications != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (apikey != null ? apikey.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (resetKey != null ? resetKey.hashCode() : 0);
        result = 31 * result + (sysadmin != null ? sysadmin.hashCode() : 0);
        result = 31 * result + (activityStreamsEmailNotifications != null ? activityStreamsEmailNotifications.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
