package tn.edu.esprit.jee.firstEjbProject.services;

import javax.ejb.Remote;

@Remote
public interface IMyServicesRemote {
	public void saluer();

}
