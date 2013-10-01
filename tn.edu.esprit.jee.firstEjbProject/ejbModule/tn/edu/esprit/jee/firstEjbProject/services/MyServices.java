package tn.edu.esprit.jee.firstEjbProject.services;

import javax.ejb.Stateless;

@Stateless
public class MyServices implements IMyServicesLocal, IMyServicesRemote {

	@Override
	public void saluer() {
		System.out.println("asslema  ya 7mema ...");
		
	}

}
