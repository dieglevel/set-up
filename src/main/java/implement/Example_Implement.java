package implement;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.Example_DAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Example_Implement extends UnicastRemoteObject implements Example_DAO{
	private static final long serialVersionUID = 1L;
	private static final String PERSISTENCE_UNIT_NAME = "JPA_SQLSEVER";
	private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;
	
	public Example_Implement() throws RemoteException{
		entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        entityManager = entityManagerFactory.createEntityManager();
	}
	
    public void open() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = entityManagerFactory.createEntityManager();
        }
    }

    public void close() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }




	

}
