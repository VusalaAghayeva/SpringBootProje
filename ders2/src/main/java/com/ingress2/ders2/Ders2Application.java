package com.ingress2.ders2;

import com.ingress2.ders2.domain.Student;
import com.ingress2.ders2.service.StudentService;
import com.ingress2.ders2.service.StudentServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

interface MackRepo extends JpaRepository<Student,Long>{

}
@SpringBootApplication
public class Ders2Application  {

	public static void main(String[] args) {
		SpringApplication.run(Ders2Application.class, args);
	}



	}

