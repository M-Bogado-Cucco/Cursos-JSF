package alex_mod_25_jpa_hibern.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import alex_mod_25_jpa_hibern.HibernateUtil;

public class GenericDAO<E> {
	
	private EntityManager entityManager = 
			HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		EntityTransaction transaction = 
				entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade);
		transaction.commit();
	}

}
