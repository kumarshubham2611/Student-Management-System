package com.student.system.repository;

import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.EntityEntryFactory;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.system.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
	//SessionFactory sessionFactory = EntityEntryFactory.unwrap(SessionFactory.class);


}
