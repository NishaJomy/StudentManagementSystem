package org.launchcode.StudentManagement;

import org.launchcode.StudentManagement.entity.Student;
import org.launchcode.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
	Student student1 = new Student("Rana","Veer","ranaveer@gmail.com");
	studentRepository.save(student1);
	}
}
