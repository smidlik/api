package dbs.projekt.api.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DISCIPLINA", schema = "AJTEAM", catalog = "")
public class DisciplinaEntity {
    private long idDisciplina;
    private Boolean idKategorie;

    @Id
    @Column(name = "ID_DISCIPLINA")
    public long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Basic
    @Column(name = "ID_KATEGORIE")
    public Boolean getIdKategorie() {
        return idKategorie;
    }

    public void setIdKategorie(Boolean idKategorie) {
        this.idKategorie = idKategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplinaEntity that = (DisciplinaEntity) o;
        return idDisciplina == that.idDisciplina &&
                Objects.equals(idKategorie, that.idKategorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDisciplina, idKategorie);
    }
}
