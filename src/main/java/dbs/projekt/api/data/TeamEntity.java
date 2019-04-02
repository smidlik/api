package dbs.projekt.api.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TEAM", schema = "AJTEAM", catalog = "")
public class TeamEntity {
    private long idTeam;
    private long idUzivatel;
    private String nazev;
    private String datumZalozeni;
    private String mesto;

    @Id
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

    @Basic
    @Column(name = "NAZEV")
    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    @Basic
    @Column(name = "DATUM_ZALOZENI")
    public String getDatumZalozeni() {
        return datumZalozeni;
    }

    public void setDatumZalozeni(String datumZalozeni) {
        this.datumZalozeni = datumZalozeni;
    }

    @Basic
    @Column(name = "MESTO")
    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamEntity that = (TeamEntity) o;
        return idTeam == that.idTeam &&
                idUzivatel == that.idUzivatel &&
                Objects.equals(nazev, that.nazev) &&
                Objects.equals(datumZalozeni, that.datumZalozeni) &&
                Objects.equals(mesto, that.mesto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTeam, idUzivatel, nazev, datumZalozeni, mesto);
    }
}
