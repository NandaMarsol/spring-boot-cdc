package br.com.mars.apicdc.dtos.request;

import br.com.mars.apicdc.dtos.Autor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class NovoAutorRequest {

    @NotBlank
    private String nome;
    @NotBlank @Email
    private String email;
    @NotBlank @Size(max = 400)
    private String descricao;

    public NovoAutorRequest(@NotBlank String nome, @NotBlank @Email String email, @NotBlank @Size(max = 400) String descricao) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    // método que recebe um Autor
    public Autor toModel() {
        return new Autor(this.nome, this.email, this.descricao);
    }
}

/*
# nome é obrigatório
# email é obrigatório
# descrição obrigatória e no máximo 400 caracteres
 */