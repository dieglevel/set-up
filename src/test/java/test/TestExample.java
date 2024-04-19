package test;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.Example_DAO;

public class TestExample {
	private Example_DAO dao;
	    @BeforeEach
	    public void setUp() throws Exception {
	        dao = (Example_DAO) Naming.lookup("rmi://localhost:7878/Example");
	    }


	    @Test
	    public void testListPoositions() throws RemoteException {
	    	
	    }
	    
	    @AfterEach
		public void tearDown() throws Exception {
			dao = null;
		}
	    

}
