package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
							"Mariam",
							"mariam.jama@gmail.com",
							LocalDate.of(2000, Month.JANUARY, 5)
							
			);
            Student alyx = new Student(
							"Alyx",
							"Alyx.Hl2@gmail.com",
							LocalDate.of(1997, Month.MAY, 10)
							
			);

            repository.saveAll(List.of(mariam, alyx ));
            

        };
    }
    
}
