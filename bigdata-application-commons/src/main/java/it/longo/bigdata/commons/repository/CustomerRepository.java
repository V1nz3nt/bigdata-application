package it.longo.bigdata.commons.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.longo.bigdata.commons.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{

}
