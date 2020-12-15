package br.com.food.controller;

import br.com.food.entity.CadastroUsuario;

import javax.enterprise.context.ApplicationScoped;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class CadastroUsuarioController {
    public CadastroUsuario update (Long id, CadastroUsuario cadastroUsuario){
        CadastroUsuario cadastroUsuarioEntity = CadastroUsuario.findById(id);

        if(cadastroUsuarioEntity == null){
            throw new WebApplicationException("Este cadastro não existe", Response.Status.NOT_FOUND);
        }
        cadastroUsuarioEntity.setCadNome(cadastroUsuario.getCadNome());
        cadastroUsuarioEntity.setCadSobrenome(cadastroUsuario.getCadSobrenome());
        cadastroUsuarioEntity.setCadTelefone(cadastroUsuario.getCadTelefone());
        cadastroUsuarioEntity.setCadCelular(cadastroUsuario.getCadCelular());
        cadastroUsuarioEntity.setCadEndereco(cadastroUsuario.getCadEndereco());
        cadastroUsuarioEntity.setCadIdade(cadastroUsuario.getCadIdade());

        return cadastroUsuarioEntity;
    }


}
