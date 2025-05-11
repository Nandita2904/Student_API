package com.nandita.studentapi;

import com.nandita.studentapi.model.Student;
import com.nandita.studentapi.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepository repository) {
        return (args) -> {
            // 🧹 Clean the table before inserting
            repository.deleteAll();

            // ✅ Insert fresh 16 student records
            repository.save(new Student("John Doe", "Computer Science", "john.doe@example.com"));
            repository.save(new Student("Jane Doe", "Information Technology", "jane.doe@example.com"));
            repository.save(new Student("Alice Smith", "Electronics", "alice.smith@example.com"));
            repository.save(new Student("Bob Brown", "Mechanical", "bob.brown@example.com"));
            repository.save(new Student("Charlie Johnson", "Civil", "charlie.johnson@example.com"));
            repository.save(new Student("David Williams", "Computer Science", "david.williams@example.com"));
            repository.save(new Student("Emily Jones", "Electrical", "emily.jones@example.com"));
            repository.save(new Student("Frank Garcia", "Aerospace", "frank.garcia@example.com"));
            repository.save(new Student("Grace Martinez", "Biotech", "grace.martinez@example.com"));
            repository.save(new Student("Hannah Rodriguez", "Chemical", "hannah.rodriguez@example.com"));
            repository.save(new Student("Isaac Lopez", "Computer Science", "isaac.lopez@example.com"));
            repository.save(new Student("Jack Gonzalez", "Information Technology", "jack.gonzalez@example.com"));
            repository.save(new Student("Katherine Perez", "Mechanical", "katherine.perez@example.com"));
            repository.save(new Student("Liam Wilson", "Civil", "liam.wilson@example.com"));
            repository.save(new Student("Megan Anderson", "Electronics", "megan.anderson@example.com"));
            repository.save(new Student("Nina Thomas", "Computer Science", "nina.thomas@example.com"));
            // Optional: Add a print statement to confirm the data is being added
            System.out.println("Sample student data has been added to the database.");
        };
    }
}
