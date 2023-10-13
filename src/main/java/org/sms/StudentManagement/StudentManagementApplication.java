package org.sms.StudentManagement;

import org.sms.StudentManagement.entity.Student;
import org.sms.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Marcelo", "Vicente", "mvicente1997@gmail.com");
		studentRepository.save(student1);

		Student student2  = new Student("Manu", "Fé", "manufe@gmail.com");
		studentRepository.save(student2);

		Student student3  = new Student("Manu", "Santos", "manusantos@gmail.com");
		studentRepository.save(student3);
	}
}
