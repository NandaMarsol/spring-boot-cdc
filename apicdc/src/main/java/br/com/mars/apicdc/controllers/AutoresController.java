package br.com.mars.apicdc.controllers;

import br.com.mars.apicdc.dtos.Autor;
import br.com.mars.apicdc.dtos.request.NovoAutorRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AutoresController {

    @PostMapping(value = "/autores")
    public String criarAutor(@RequestBody @Valid NovoAutorRequest novoAutorRequest) {

        Autor autor = novoAutorRequest.toModel();

        return autor.toString();
    }
}


/*
# Para receber os dados da request como json, temos a annotation @RequestBody
# Usamos a annotation @Valid para pedir que os dados da request sejam validados
# Para realizar as validações padrões existe a Bean Validation
 */
