package dbs.projekt.api.data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "UCASTNIK", schema = "AJTEAM", catalog = "")
public class UcastnikEntity {
    private long idUcastnik;
    private long idTeam;
    private Time vysledek1;
    private Time vysledek2;
    private boolean ucast;
    private Long idZavodnik;

    @Id
    @Column(name = "ID_UCASTNIK")
    public long getIdUcastnik() {
        return idUcastnik;
    }

    public void setIdUcastnik(long idUcastnik) {
        this.idUcastnik = idUcastnik;
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
    @Column(name = "VYSLEDEK1")
    public Time getVysledek1() {
        return vysledek1;
    }

    public void setVysledek1(Time vysledek1) {
        this.vysledek1 = vysledek1;
    }

    @Basic
    @Column(name = "VYSLEDEK2")
    public Time getVysledek2() {
        return vysledek2;
    }

    public void setVysledek2(Time vysledek2) {
        this.vysledek2 = vysledek2;
    }

    @Basic
    @Column(name = "UCAST")
    public boolean isUcast() {
        return ucast;
    }

    public void setUcast(boolean ucast) {
        this.ucast = ucast;
    }

    @Basic
    @Column(name = "ID_ZAVODNIK")
    public Long getIdZavodnik() {
        return idZavodnik;
    }

    public void setIdZavodnik(Long idZavodnik) {
        this.idZavodnik = idZavodnik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UcastnikEntity that = (UcastnikEntity) o;
        return idUcastnik == that.idUcastnik &&
                idTeam == that.idTeam &&
                ucast == that.ucast &&
                Objects.equals(vysledek1, that.vysledek1) &&
                Objects.equals(vysledek2, that.vysledek2) &&
                Objects.equals(idZavodnik, that.idZavodnik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUcastnik, idTeam, vysledek1, vysledek2, ucast, idZavodnik);
    }
}
