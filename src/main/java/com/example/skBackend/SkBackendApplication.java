package com.example.skBackend;

import com.example.skBackend.controller.EmployeeController;
import com.example.skBackend.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkBackendApplication {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.getFirstName();
		SpringApplication.run(SkBackendApplication.class, args);
	}

}
