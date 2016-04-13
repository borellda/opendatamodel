package de.borellda.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "search_popular_approved", schema = "public", catalog = "ecodp")
public class SearchPopularApprovedEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(SearchPopularApprovedEntity.class);
    private String lang;
    private String searchString;
    private Long count;

    @Basic
    @Column(name = "lang", nullable = true, length = 10)
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
    @Column(name = "count", nullable = false)
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchPopularApprovedEntity that = (SearchPopularApprovedEntity) o;

        if (lang != null ? !lang.equals(that.lang) : that.lang != null) return false;
        if (searchString != null ? !searchString.equals(that.searchString) : that.searchString != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lang != null ? lang.hashCode() : 0;
        result = 31 * result + (searchString != null ? searchString.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}
