package dao;
// Generated Jun 22, 2021 12:34:00 PM by Hibernate Tools 5.1.10.Final


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import models.ArticlesApprovisionnement;

/**
 * Home object for domain model class ArticlesApprovisionnement.
 * @see dao.ArticlesApprovisionnement
 * @author Hibernate Tools
 */

public class ArticlesApprovisionnementHome {


	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ArticlesApprovisionnement transientInstance) {
		try {
			entityManager.persist(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void remove(ArticlesApprovisionnement persistentInstance) {
		try {
			entityManager.remove(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public ArticlesApprovisionnement merge(ArticlesApprovisionnement detachedInstance) {
		try {
			ArticlesApprovisionnement result = entityManager.merge(detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public ArticlesApprovisionnement findById(Integer id) {
		try {
			ArticlesApprovisionnement instance = entityManager.find(ArticlesApprovisionnement.class, id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
