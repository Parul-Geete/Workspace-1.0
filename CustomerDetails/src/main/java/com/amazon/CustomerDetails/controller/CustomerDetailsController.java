package com.amazon.CustomerDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.CustomerDetails.DTO.CustomerDetailsDto;
import com.amazon.CustomerDetails.service.CustomerDetailsService;

@RestController
public class CustomerDetailsController {

	@Autowired
	CustomerDetailsService customerDetailsService;

	@RequestMapping("/customer-details")
	@PostMapping
	public void saveCustomerDetails(@RequestBody List<CustomerDetailsDto> customerDetailsDto) {
		customerDetailsService.saveCustomer(customerDetailsDto);

	}

}
