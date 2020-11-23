package br.com.companyhoteis.servicehoteis.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Hotel {

    private Long id;
    @NotEmpty(message = "Favor inserir o nome")
    private String nome;
    @NotEmpty(message = "Favor inserir o email")
    private String email;
    @NotNull(message = "Favor inserir o telefone")
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
