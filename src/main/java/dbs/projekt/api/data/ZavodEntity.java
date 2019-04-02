package dbs.projekt.api.data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "ZAVOD", schema = "AJTEAM", catalog = "")
public class ZavodEntity {
    private long idZavod;
    private long idUzivatel;
    private short idLiga;
    private String nazev;
    private String mesto;
    private String ulice;
    private Time datumZalozeni;

    @Id
    @Column(name = "ID_ZAVOD")
    public long getIdZavod() {
        return idZavod;
    }

    public void setIdZavod(long idZavod) {
        this.idZavod = idZavod;
    }

    @Basic
    @Column(name = "ID_UZIVATEL")
    public long getIdUzivatel() {
        return idUzivatel;
    }

    public void setIdUzivatel(long idUzivatel) {
        this.idUzivatel = idUzivatel;
    }

    @Basic
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
    @Column(name = "MESTO")
    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    @Basic
    @Column(name = "ULICE")
    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    @Basic
    @Column(name = "DATUM_ZALOZENI")
    public Time getDatumZalozeni() {
        return datumZalozeni;
    }

    public void setDatumZalozeni(Time datumZalozeni) {
        this.datumZalozeni = datumZalozeni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZavodEntity that = (ZavodEntity) o;
        return idZavod == that.idZavod &&
                idUzivatel == that.idUzivatel &&
                idLiga == that.idLiga &&
                Objects.equals(nazev, that.nazev) &&
                Objects.equals(mesto, that.mesto) &&
                Objects.equals(ulice, that.ulice) &&
                Objects.equals(datumZalozeni, that.datumZalozeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZavod, idUzivatel, idLiga, nazev, mesto, ulice, datumZalozeni);
    }
}
