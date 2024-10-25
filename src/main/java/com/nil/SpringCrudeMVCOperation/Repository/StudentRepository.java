package com.nil.SpringCrudeMVCOperation.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.SpringCrudeMVCOperation.Model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
