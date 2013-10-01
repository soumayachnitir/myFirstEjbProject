package tn.edu.esprit.jee.firstEjbProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.jee.firstEjbProject.domain.Student;
import tn.edu.esprit.jee.firstEjbProject.services.HazarServicesRemote;

public class TestAddStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			HazarServicesRemote proxy = (HazarServicesRemote) context
					.lookup("tn.edu.esprit.jee.firstEjbProject/HazarServices!tn.edu.esprit.jee.firstEjbProject.services.HazarServicesRemote");

			Student student = new Student();
			student.setNameStudent("hazar");
			
			proxy.addStudent(student);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
