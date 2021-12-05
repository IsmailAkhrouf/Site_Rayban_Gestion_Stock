package dao;
// Generated Jun 22, 2021 12:34:00 PM by Hibernate Tools 5.1.10.Final


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import models.ArticlesStock;


/**
 * Home object for domain model class ArticlesStock.
 * @see dao.ArticlesStock
 * @author Hibernate Tools
 */

public class ArticlesStockHome {


	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ArticlesStock transientInstance) {
		try {
			entityManager.persist(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void remove(ArticlesStock persistentInstance) {
		try {
			entityManager.remove(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public ArticlesStock merge(ArticlesStock detachedInstance) {
		try {
			ArticlesStock result = entityManager.merge(detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public ArticlesStock findById(Integer id) {
		try {
			ArticlesStock instance = entityManager.find(ArticlesStock.class, id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
