package de.borellda.domain;

import javax.persistence.*;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "tag", schema = "public", catalog = "ecodp")
public class TagEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(TagEntity.class);
    private String id;
    private String name;
    private String vocabularyId;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "vocabulary_id", nullable = true, length = 100)
    public String getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagEntity tagEntity = (TagEntity) o;

        if (id != null ? !id.equals(tagEntity.id) : tagEntity.id != null) return false;
        if (name != null ? !name.equals(tagEntity.name) : tagEntity.name != null) return false;
        if (vocabularyId != null ? !vocabularyId.equals(tagEntity.vocabularyId) : tagEntity.vocabularyId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (vocabularyId != null ? vocabularyId.hashCode() : 0);
        return result;
    }
}
