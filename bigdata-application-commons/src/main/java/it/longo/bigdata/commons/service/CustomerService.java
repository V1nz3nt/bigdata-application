package it.longo.bigdata.commons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.longo.bigdata.commons.model.Customer;
import it.longo.bigdata.commons.repository.CustomerRepository;

@Service
public class CustomerService {
	protected CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> findAll(){
		return this.customerRepository.findAll();
	}
}
