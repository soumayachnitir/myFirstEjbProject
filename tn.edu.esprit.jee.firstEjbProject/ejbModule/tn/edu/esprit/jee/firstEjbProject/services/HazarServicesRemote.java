package tn.edu.esprit.jee.firstEjbProject.services;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.jee.firstEjbProject.domain.Student;

@Remote
public interface HazarServicesRemote {
	public void addStudent(Student student);

	public Student findStudentById(int idStudent);

	public void deleteStudent(int idStudent);

	public void updateStudent(Student studentNew);

	public List<Student> findAllStudents();

	public List<Student> findAllStudentsByName(String nameStudent);

}
