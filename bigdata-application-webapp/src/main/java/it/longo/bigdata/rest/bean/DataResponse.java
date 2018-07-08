package it.longo.bigdata.rest.bean;

import java.util.List;

import it.longo.bigdata.commons.model.Customer;

public class DataResponse {
	private List<Customer> data;
	
	public DataResponse(List<Customer> data) {
		super();
		this.data = data;
	}
	public List<Customer> getData() {
		return data;
	}
	public void setData(List<Customer> data) {
		this.data = data;
	}
}
