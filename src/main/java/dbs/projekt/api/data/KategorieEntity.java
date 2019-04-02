package dbs.projekt.api.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "KATEGORIE", schema = "AJTEAM", catalog = "")
public class KategorieEntity {
    private boolean idKategorie;
    private String nazev;

    @Id
    @Column(name = "ID_KATEGORIE")
    public boolean isIdKategorie() {
        return idKategorie;
    }

    public void setIdKategorie(boolean idKategorie) {
        this.idKategorie = idKategorie;
    }

    @Basic
    @Column(name = "NAZEV")
    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KategorieEntity that = (KategorieEntity) o;
        return idKategorie == that.idKategorie &&
                Objects.equals(nazev, that.nazev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKategorie, nazev);
    }
}
