package br.com.food.resource;

import br.com.food.controller.CadastroUsuarioController;
import br.com.food.entity.CadastroUsuario;

import javax.inject.Inject;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/cadastroUsuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CadastroUsuarioResource {

    @Inject
    private CadastroUsuarioController cadastroUsuarioController;

    @GET
    public List<CadastroUsuario> findAll(){
        return CadastroUsuario.listAll();
    }

    @POST
    @Transactional
    public Response create(CadastroUsuario cadastroUsuario){
        CadastroUsuario.persist(cadastroUsuario);
        return Response.ok(cadastroUsuario).status(201).build();
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, CadastroUsuario cadastroUsuario){

        CadastroUsuario cadastroUsuarioentity = cadastroUsuarioController.update(id,cadastroUsuario);

        return Response.ok(cadastroUsuarioentity).build();


    }
    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        CadastroUsuario cadastroUsuarioentity = CadastroUsuario.findById(id);
        if(cadastroUsuarioentity == null){
            throw new WebApplicationException("Cadastro não existe", Response.Status.NOT_FOUND);
        }
        cadastroUsuarioentity.delete();
        return Response.status(204).build();
    }
}



