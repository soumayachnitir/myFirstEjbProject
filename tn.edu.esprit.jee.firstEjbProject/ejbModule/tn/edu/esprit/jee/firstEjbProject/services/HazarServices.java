package tn.edu.esprit.jee.firstEjbProject.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.jee.firstEjbProject.domain.Student;

/**
 * Session Bean implementation class HazarServices
 */
@Stateless
public class HazarServices implements HazarServicesRemote, HazarServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public HazarServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addStudent(Student student) {

		entityManager.persist(student);
	}

	@Override
	public Student findStudentById(int idStudent) {

		return entityManager.find(Student.class, idStudent);
	}

	@Override
	public void deleteStudent(int idStudent) {
		entityManager.remove(findStudentById(idStudent));

	}

	@Override
	public void updateStudent(Student studentNew) {
		entityManager.merge(studentNew);

	}

	@Override
	public List<Student> findAllStudents() {
		String jpql = "select a from Student a";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public List<Student> findAllStudentsByName(String nameStudent) {
		String jpql = "select a from Student a where a.nameStudent =:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", nameStudent);
		return query.getResultList();
	}

}
