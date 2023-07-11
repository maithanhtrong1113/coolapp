package com.example.coolapp;

import com.example.coolapp.dao.StudentDAO;
import com.example.coolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CoolappApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoolappApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            createStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {

//        Alter table  student_tracker.student auto_increment=2000; thay đổi index bắt đầu =2000
        Student student1= new Student("Thanh","Trong","maithanhtrong1113@gmail.com");
        Student student2= new Student("Mai","Trong","maithanhtrong1113@gmail.com");

        studentDAO.save(student1);
        studentDAO.save(student2);
    }
}
