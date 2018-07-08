package it.longo.bigdata.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.longo.bigdata.commons.service.CustomerService;
import it.longo.bigdata.rest.bean.DataResponse;

@RestController
@RequestMapping("/rest")
public class DataRestController {
	protected CustomerService customerService;
	
	@Autowired
	public DataRestController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@RequestMapping("/all")
	public DataResponse all() {
		return new DataResponse(this.customerService.findAll());
	}
}
