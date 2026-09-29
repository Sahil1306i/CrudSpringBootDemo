package com.example.crudSpringBootDemo.Repository;

import com.example.crudSpringBootDemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
// there are no beans for a interface but spring can store the beans for the implementation of the interface
public interface StudentRepository extends JpaRepository<Student, Long> {

}

