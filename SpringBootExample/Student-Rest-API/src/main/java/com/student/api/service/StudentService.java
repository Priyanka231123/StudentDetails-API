package com.student.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.api.model.Student;
import com.student.api.repository.StudentRepo;

@Service
public class StudentService
{
@Autowired
private StudentRepo studentRepo;

//method for display student details
public List<Student> getDetails()
{
	return studentRepo.findAll();
}

//method for display student details based on id
public Optional<Student> getSingleDetails(Integer id)
{
	return studentRepo.findById(id);
}

//method for add new student details
public Student addDetails(Student stud)
{
	return studentRepo.save(stud);
}

//method for update existing student details
public Student updateDetails(Student stud)
{
	return studentRepo.save(stud);
}

//method for delete student details based on id
public void deleteDetails(Integer id)
{
	 studentRepo.deleteById(id);
}
}
