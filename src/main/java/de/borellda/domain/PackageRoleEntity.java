package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "package_role", schema = "public", catalog = "ecodp")
public class PackageRoleEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(PackageRoleEntity.class);
    private String userObjectRoleId;
    private String packageId;

    @Id
    @Column(name = "user_object_role_id", nullable = false, length = -1)
    public String getUserObjectRoleId() {
        return userObjectRoleId;
    }

    public void setUserObjectRoleId(String userObjectRoleId) {
        this.userObjectRoleId = userObjectRoleId;
    }

    @Basic
    @Column(name = "package_id", nullable = true, length = -1)
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageRoleEntity that = (PackageRoleEntity) o;

        if (userObjectRoleId != null ? !userObjectRoleId.equals(that.userObjectRoleId) : that.userObjectRoleId != null)
            return false;
        if (packageId != null ? !packageId.equals(that.packageId) : that.packageId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userObjectRoleId != null ? userObjectRoleId.hashCode() : 0;
        result = 31 * result + (packageId != null ? packageId.hashCode() : 0);
        return result;
    }
}
