package com.amazon.CustomerDetails.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amazon.CustomerDetails.DTO.CustomerDetailsDto;

@Service
public interface CustomerDetailsService {

	public void saveCustomer(List<CustomerDetailsDto> customerDetailsDto);

}
