package com.example.test.demoNewss.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepository extends JpaRepository<Emp,Long> {
//    @Autowired
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public List<Emp> getEmpFromDb(long id){
//        return entityManager.createQuery("Select e from Emp e where e.id=:id",Emp.class)
//                .setParameter("id",id)
//                .getResultList();
//    }
}
