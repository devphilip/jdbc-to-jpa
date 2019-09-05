package com.devphilip.tut_in28min.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.devphilip.tut_in28min.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	// Connect to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public Person update(Person person) {
		return entityManager.merge(person);
	} 

}
