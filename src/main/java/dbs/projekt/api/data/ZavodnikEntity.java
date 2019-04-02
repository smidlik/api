package dbs.projekt.api.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ZAVODNIK", schema = "AJTEAM", catalog = "")
public class ZavodnikEntity {
    private long idZavodnik;
    private long idTeam;
    private long idUzivatel;

    @Id
    @Column(name = "ID_ZAVODNIK")
    public long getIdZavodnik() {
        return idZavodnik;
    }

    public void setIdZavodnik(long idZavodnik) {
        this.idZavodnik = idZavodnik;
    }

    @Basic
    @Column(name = "ID_TEAM")
    public long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(long idTeam) {
        this.idTeam = idTeam;
    }

    @Basic
    @Column(name = "ID_UZIVATEL")
    public long getIdUzivatel() {
        return idUzivatel;
    }

    public void setIdUzivatel(long idUzivatel) {
        this.idUzivatel = idUzivatel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZavodnikEntity that = (ZavodnikEntity) o;
        return idZavodnik == that.idZavodnik &&
                idTeam == that.idTeam &&
                idUzivatel == that.idUzivatel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZavodnik, idTeam, idUzivatel);
    }
}
