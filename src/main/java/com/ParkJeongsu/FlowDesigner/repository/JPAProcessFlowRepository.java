package com.ParkJeongsu.FlowDesigner.repository;

import com.ParkJeongsu.FlowDesigner.domain.ProcessFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class JPAProcessFlowRepository implements ProcessFlowRepository{

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager em;

    @Override
    public List<ProcessFlow> reallAll() {
        em = emf.createEntityManager();
        String jpql = "SELECT b FROM ProcessFlow b";
        Query query = em.createQuery(jpql);
        List<ProcessFlow> processFlowList = query.getResultList();
        return processFlowList;
    }
}
