package com.contractapp.app.ContractManagement;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@SpringBootApplication
@ComponentScan ({"com.contractapp.app.ContractManagement","com.contractapp.app.controllers","com.contractapp.app.models"})
@EnableMongoRepositories ("com.contractapp.app.repositories")
public class ContractManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContractManagementApplication.class, args);
	}
}
