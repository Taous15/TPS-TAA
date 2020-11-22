package fr.istic.taa.metier.jpa;

import fr.istic.taa.metier.dao.generic.KanbanDao;
import fr.istic.taa.metier.dao.generic.UserDao;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		UserDao userDao = new UserDao();
		userDao.createUser("Taous");
		userDao.createUser("Sarah");
		userDao.createUser("Thomas");
		userDao.createUser("Pierre");
		
		 KanbanDao dao = new KanbanDao();
		 Kanban kanban =new Kanban();
	
		 kanban.setNom("TP1 TAA");
		 kanban.setNom("TP1 GLI");
		 kanban.setNom("TP JAVA");
	     dao.save(kanban);
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//tx.commit();


		//manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
