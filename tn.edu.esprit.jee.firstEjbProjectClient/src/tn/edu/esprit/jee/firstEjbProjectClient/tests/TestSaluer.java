package tn.edu.esprit.jee.firstEjbProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.jee.firstEjbProject.services.IMyServicesRemote;

public class TestSaluer {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			IMyServicesRemote proxy = (IMyServicesRemote) context
					.lookup("tn.edu.esprit.jee.firstEjbProject/MyServices!tn.edu.esprit.jee.firstEjbProject.services.IMyServicesRemote");

			proxy.saluer();

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
