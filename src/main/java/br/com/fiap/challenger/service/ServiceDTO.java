package br.com.fiap.challenger.service;

import org.springframework.data.domain.Example;

import java.util.Collection;

public interface ServiceDTO<Entity, Request, Response> {

    /**
     * Este método converte um DTO de requisição para uma
     * Entidade pronta para ser persistida pela primeira vez no Banco de dados
     *
     * @param request um DTO de Request
     * @return é a Entidade pronta para ser salva pela primeira vez no Banco de dados
     */

    Entity toEntity(Request request);

    Response toResponse(Entity entity);

    Collection<Entity> findAll();

    Collection<Entity> findAll(Example<Entity> example);

    Entity findById(Long id);

    Entity save(Entity entity);


}