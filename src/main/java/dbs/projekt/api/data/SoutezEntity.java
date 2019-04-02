package dbs.projekt.api.data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SOUTEZ", schema = "AJTEAM", catalog = "")
public class SoutezEntity {
    private long idSoutez;
    private long idZavod;
    private Time datumZalozeni;
    private long idDisciplina;

    @Id
    @Column(name = "ID_SOUTEZ")
    public long getIdSoutez() {
        return idSoutez;
    }

    public void setIdSoutez(long idSoutez) {
        this.idSoutez = idSoutez;
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
    @Column(name = "ID_DISCIPLINA")
    public long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoutezEntity that = (SoutezEntity) o;
        return idSoutez == that.idSoutez &&
                idZavod == that.idZavod &&
                idDisciplina == that.idDisciplina &&
                Objects.equals(datumZalozeni, that.datumZalozeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSoutez, idZavod, datumZalozeni, idDisciplina);
    }
}
