package dbs.projekt.api.data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "UZIVATEL", schema = "AJTEAM", catalog = "")
public class UzivatelEntity {
    private long idUzivatel;
    private String uzivatelskeJmeno;
    private String jmeno;
    private String prijmeni;
    private String telefon;
    private String email;
    private String heslo;
    private Time datumZalozeni;
    private boolean adminLevel;

    @Id
    @Column(name = "ID_UZIVATEL")
    public long getIdUzivatel() {
        return idUzivatel;
    }

    public void setIdUzivatel(long idUzivatel) {
        this.idUzivatel = idUzivatel;
    }

    @Basic
    @Column(name = "UZIVATELSKE_JMENO")
    public String getUzivatelskeJmeno() {
        return uzivatelskeJmeno;
    }

    public void setUzivatelskeJmeno(String uzivatelskeJmeno) {
        this.uzivatelskeJmeno = uzivatelskeJmeno;
    }

    @Basic
    @Column(name = "JMENO")
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    @Basic
    @Column(name = "PRIJMENI")
    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    @Basic
    @Column(name = "TELEFON")
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "HESLO")
    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
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
    @Column(name = "ADMIN_LEVEL")
    public boolean isAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(boolean adminLevel) {
        this.adminLevel = adminLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UzivatelEntity that = (UzivatelEntity) o;
        return idUzivatel == that.idUzivatel &&
                adminLevel == that.adminLevel &&
                Objects.equals(uzivatelskeJmeno, that.uzivatelskeJmeno) &&
                Objects.equals(jmeno, that.jmeno) &&
                Objects.equals(prijmeni, that.prijmeni) &&
                Objects.equals(telefon, that.telefon) &&
                Objects.equals(email, that.email) &&
                Objects.equals(heslo, that.heslo) &&
                Objects.equals(datumZalozeni, that.datumZalozeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUzivatel, uzivatelskeJmeno, jmeno, prijmeni, telefon, email, heslo, datumZalozeni, adminLevel);
    }
}
