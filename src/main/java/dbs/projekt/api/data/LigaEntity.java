package dbs.projekt.api.data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "LIGA", schema = "AJTEAM", catalog = "")
public class LigaEntity {
    private short idLiga;
    private String nazev;
    private long rok;
    private long idZavod;
    private Time datumZalozeni;
    private long idUzivatel;

    @Id
    @Column(name = "ID_LIGA")
    public short getIdLiga() {
        return idLiga;
    }

    public void setIdLiga(short idLiga) {
        this.idLiga = idLiga;
    }

    @Basic
    @Column(name = "NAZEV")
    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    @Basic
    @Column(name = "ROK")
    public long getRok() {
        return rok;
    }

    public void setRok(long rok) {
        this.rok = rok;
    }

    @Basic
    @Column(name = "ID_ZAVOD")
    public long getIdZavod() {
        return idZavod;
    }

    public void setIdZavod(long idZavod) {
        this.idZavod = idZavod;
    }

    @Basic
    @Column(name = "DATUM_ZALOZENI")
    public Time getDatumZalozeni() {
        return datumZalozeni;
    }

    public void setDatumZalozeni(Time datumZalozeni) {
        this.datumZalozeni = datumZalozeni;
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
        LigaEntity that = (LigaEntity) o;
        return idLiga == that.idLiga &&
                rok == that.rok &&
                idZavod == that.idZavod &&
                idUzivatel == that.idUzivatel &&
                Objects.equals(nazev, that.nazev) &&
                Objects.equals(datumZalozeni, that.datumZalozeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLiga, nazev, rok, idZavod, datumZalozeni, idUzivatel);
    }
}
