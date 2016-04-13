package de.borellda.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "search_query", schema = "public", catalog = "ecodp")
public class SearchQueryEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(SearchQueryEntity.class);
    private String lang;
    private String searchString;
    private Timestamp searchedAt;

    @Basic
    @Column(name = "lang", nullable = false, length = 10)
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Basic
    @Column(name = "search_string", nullable = false, length = -1)
    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    @Basic
    @Column(name = "searched_at", nullable = true)
    public Timestamp getSearchedAt() {
        return searchedAt;
    }

    public void setSearchedAt(Timestamp searchedAt) {
        this.searchedAt = searchedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchQueryEntity that = (SearchQueryEntity) o;

        if (lang != null ? !lang.equals(that.lang) : that.lang != null) return false;
        if (searchString != null ? !searchString.equals(that.searchString) : that.searchString != null) return false;
        if (searchedAt != null ? !searchedAt.equals(that.searchedAt) : that.searchedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lang != null ? lang.hashCode() : 0;
        result = 31 * result + (searchString != null ? searchString.hashCode() : 0);
        result = 31 * result + (searchedAt != null ? searchedAt.hashCode() : 0);
        return result;
    }
}
