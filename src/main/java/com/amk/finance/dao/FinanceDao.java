package com.amk.finance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amk.finance.entity.FeeStructureEntity;
@Service
public class FinanceDao {
	//@Autowired
	private EntityManager em;
	
	@Autowired
	private EntityManagerFactory factory;
	
	
	public FeeStructureEntity getFeeStructure(int grade, int year) {
        em = factory.createEntityManager();
		Query query = em.createNamedQuery("FeeStrutcure.getFeeStructure");//("from FeeStructureEntity f where f.grade=:grade and f.year=:year");
		query.setParameter("grade", grade);
		query.setParameter("year", year);

		List<FeeStructureEntity> feeStructureList = query.getResultList();
		FeeStructureEntity feeStructure = null;
		if (feeStructureList != null && !feeStructureList.isEmpty()) {
			feeStructure = feeStructureList.get(0);
		}
		em.close();
		return feeStructure;
	}

}
