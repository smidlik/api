package dbs.projekt.api.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "STAROVNI_LISTINA", schema = "AJTEAM", catalog = "")
public class StarovniListinaEntity {
    private long idUcastnik;
    private long idSoutez;

    @Basic
    @Column(name = "ID_UCASTNIK")
    public long getIdUcastnik() {
        return idUcastnik;
    }

    public void setIdUcastnik(long idUcastnik) {
        this.idUcastnik = idUcastnik;
    }

    @Basic
    @Column(name = "ID_SOUTEZ")
    public long getIdSoutez() {
        return idSoutez;
    }

    public void setIdSoutez(long idSoutez) {
        this.idSoutez = idSoutez;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarovniListinaEntity that = (StarovniListinaEntity) o;
        return idUcastnik == that.idUcastnik &&
                idSoutez == that.idSoutez;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUcastnik, idSoutez);
    }
}
