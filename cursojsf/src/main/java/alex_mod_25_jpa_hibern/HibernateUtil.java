package alex_mod_25_jpa_hibern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	public static EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("cursojsf");
	
	static	 {
		init();
	}
	
	
	private static void init() {
		try {
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("cursojsf");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); /* provê a parte de persistência*/
	}

}



















