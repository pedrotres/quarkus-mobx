package br.com.food.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class CadastroUsuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cadId;
    @Column
    private String cadNome;
    @Column
    private String cadSobrenome;
    @Column
    private String cadTelefone;
    @Column
    private String cadCelular;
    @Column
    private String cadEndereco;
    @Column
    private int cadIdade;

    public Long getCadId() {
        return cadId;
    }

    public void setCadId(Long cadId) {
        this.cadId = cadId;
    }

    public String getCadNome() {
        return cadNome;
    }

    public void setCadNome(String cadNome) {
        this.cadNome = cadNome;
    }

    public String getCadSobrenome() {
        return cadSobrenome;
    }

    public void setCadSobrenome(String cadSobrenome) {
        this.cadSobrenome = cadSobrenome;
    }

    public String getCadTelefone() {
        return cadTelefone;
    }

    public void setCadTelefone(String cadTelefone) {
        this.cadTelefone = cadTelefone;
    }

    public String getCadCelular() {
        return cadCelular;
    }

    public void setCadCelular(String cadCelular) {
        this.cadCelular = cadCelular;
    }

    public String getCadEndereco() {
        return cadEndereco;
    }

    public void setCadEndereco(String cadEndereco) {
        this.cadEndereco = cadEndereco;
    }

    public int getCadIdade() {
        return cadIdade;
    }

    public void setCadIdade(int cadIdade) {
        this.cadIdade = cadIdade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CadastroUsuario that = (CadastroUsuario) o;
        return cadId.equals(that.cadId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadId);
    }
}
