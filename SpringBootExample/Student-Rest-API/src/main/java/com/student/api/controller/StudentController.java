package com.student.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.student.api.model.Student;
import com.student.api.service.StudentService;

@RestController
@RequestMapping("/studentdata")
public class StudentController 
{
@Autowired
private StudentService studentService;

//fetch the all student details from database
@GetMapping("/getdata")
public List<Student> getDetails()
{
	return studentService.getDetails();
}

//fetch the single student details based on id
@GetMapping("/getdata/{id}")
public Optional<Student> getSingleDetails(@PathVariable("id")Integer id)
{
	return studentService.getSingleDetails(id);
}

//save the student details into database
@PostMapping("/adddata")
public Student addDetails(@RequestBody Student stud)
{
	return studentService.addDetails(stud);
}

//update the existing student details
@PutMapping("/updatedata")
public Student updateDetails(@RequestBody Student stud)
{
	return studentService.updateDetails(stud);
}

//delete the student details based on id
@DeleteMapping("/deletedata/{id}")
public String deleteDetails(@PathVariable("id")Integer id)
{
	studentService.deleteDetails(id);
	return "deleted data";
	
}
}
