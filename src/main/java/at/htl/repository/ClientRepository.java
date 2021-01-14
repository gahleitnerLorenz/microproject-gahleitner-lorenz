package at.htl.repository;

import at.htl.entity.Client;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ClientRepository {
    @Inject
    EntityManager entityManager;

    public List<Client> findAll() {return entityManager.createNamedQuery("Client.findAll").getResultList();}
}
