package com.ParkJeongsu.FlowDesigner.repository;

import com.ParkJeongsu.FlowDesigner.domain.MESFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class JPAMESFactoryRepository implements MESFactoryRepository{

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager em;

    @Override
    public List<MESFactory> reallAll() {
        em = emf.createEntityManager();
        String jpql = "SELECT b FROM MESFactory b";
        Query query = em.createQuery(jpql);
        List<MESFactory> mesFactoryList = query.getResultList();
        return mesFactoryList;
    }
}
