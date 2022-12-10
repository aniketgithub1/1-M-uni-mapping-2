package com.jcp.MobileSim;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMobileSim {

	public static void main(String[] args) {

		EntityManagerFactory eMFactory = Persistence.createEntityManagerFactory("aniket");
		EntityManager eManager = eMFactory.createEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		
		Mobile mobile = new Mobile();
		mobile.setName("IPHONE");
		mobile.setBrand("apple");
	}

}
