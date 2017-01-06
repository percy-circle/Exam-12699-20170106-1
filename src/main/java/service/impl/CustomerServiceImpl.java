package service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import mapper.CustomerMapper;
import po.Customer;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
    
	public Customer findCustomerByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return customerMapper.findCustomerByFirstName(firstName);
	}
        
}
