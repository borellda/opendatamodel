package de.borellda.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by borellda on 2/24/2016.
 */
@Entity
@Table(name = "term_translation", schema = "public", catalog = "ecodp")
public class TermTranslationEntity {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(TermTranslationEntity.class);
    private String term;
    private String termTranslation;
    private String langCode;

    @Basic
    @Column(name = "term", nullable = false, length = -1)
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Basic
    @Column(name = "term_translation", nullable = false, length = -1)
    public String getTermTranslation() {
        return termTranslation;
    }

    public void setTermTranslation(String termTranslation) {
        this.termTranslation = termTranslation;
    }

    @Basic
    @Column(name = "lang_code", nullable = false, length = -1)
    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TermTranslationEntity that = (TermTranslationEntity) o;

        if (term != null ? !term.equals(that.term) : that.term != null) return false;
        if (termTranslation != null ? !termTranslation.equals(that.termTranslation) : that.termTranslation != null)
            return false;
        if (langCode != null ? !langCode.equals(that.langCode) : that.langCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = term != null ? term.hashCode() : 0;
        result = 31 * result + (termTranslation != null ? termTranslation.hashCode() : 0);
        result = 31 * result + (langCode != null ? langCode.hashCode() : 0);
        return result;
    }
}
