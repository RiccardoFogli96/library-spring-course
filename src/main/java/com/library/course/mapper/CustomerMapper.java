package com.library.course.mapper;

import com.library.course.entity.Customer;
import com.library.course.model.CreateCustomerDTO;
import com.library.course.model.CustomerDTO;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

	public Customer toCustomer (CreateCustomerDTO createCustomerDTO ){

		return Customer.builder()
				.email(createCustomerDTO.getEmail())
				.firstName(createCustomerDTO.getFirstName())
				.lastName(createCustomerDTO.getLastName())
				.build();
	}

	public CustomerDTO toCustomerDTO (Customer customer){
		return CustomerDTO.builder()
				.email(customer.getEmail())
				.id(customer.getId())
				.firstName(customer.getFirstName())
				.lastName(customer.getLastName())
				.build();
	}

	public Customer toCustomer(CustomerDTO customerDTO){
		return Customer
				.builder()
				.email(customerDTO.getEmail())
				.id(customerDTO.getId())
				.firstName(customerDTO.getFirstName())
				.lastName(customerDTO.getLastName())
				.build();
	}
}
