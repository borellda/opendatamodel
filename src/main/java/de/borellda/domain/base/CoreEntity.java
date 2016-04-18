package de.borellda.domain.base;

import org.hibernate.annotations.GenericGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by borellda on 3/15/2016.
 */
@MappedSuperclass
public abstract class CoreEntity implements Serializable{
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8040475093858149074L;
    /** The Logger **/
    private static final Logger log = LoggerFactory.getLogger(CoreEntity.class);

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "label", nullable = false )
    private String label;


    public CoreEntity(){
        super();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return (getClass() + "." + getLabel()).hashCode();
    }

    /** {@inheritDoc} */
    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (!getClass().equals(obj.getClass())) {
            return false;
        }

        CoreEntity other = (CoreEntity) obj;

        // if the name is missing, return false
        if (getLabel() == null) {
            return false;
        }
        return getLabel().equals(other.getLabel());
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return String.format("%s ID[%s], Name[%s]", getClass().getSimpleName(), this.getId().toString() != null ? this.getId()
                .toString() : "NULL", null != this.getLabel() ? this.getLabel(): "NULL");
    }
}
