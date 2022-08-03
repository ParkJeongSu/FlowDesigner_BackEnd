package com.ParkJeongsu.FlowDesigner.repository;

import com.ParkJeongsu.FlowDesigner.domain.ProcessFlow;
import com.ParkJeongsu.FlowDesigner.domain.ProcessOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class JPAProcessOperationRepository implements ProcessOperationRepository{

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager em;

    @Override
    public List<ProcessOperation> reallAll() {
        em = emf.createEntityManager();
        String jpql = "SELECT b FROM ProcessOperation b";
        Query query = em.createQuery(jpql);
        List<ProcessOperation> operationList = query.getResultList();
        return operationList;
    }
}
