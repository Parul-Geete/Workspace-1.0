package com.amazon.CustomerDetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.CustomerDetails.DTO.CustomerDetailsDto;
import com.amazon.CustomerDetails.Entities.CustomerDetailsEntity;
import com.amazon.CustomerDetails.repo.CustomerDetailsRepo;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	CustomerDetailsRepo customerDetailsRepo;

	@Override
	public void saveCustomer(List<CustomerDetailsDto> customerDetailsDto) {

		List<CustomerDetailsEntity> CustomerDetails = converToEntities(customerDetailsDto);
		customerDetailsRepo.saveAll(CustomerDetails);

	}

	private List<CustomerDetailsEntity> converToEntities(List<CustomerDetailsDto> customerDetailsDto) {
		List<CustomerDetailsEntity> entites = new ArrayList<>();

		for (CustomerDetailsDto dto : customerDetailsDto) {

			CustomerDetailsEntity entity = new CustomerDetailsEntity();

			entity.setFirstName(dto.getFirstName());
			entity.setLastName(dto.getLastName());
			entity.setGender(dto.getGender());
			entity.setAge(dto.getAge());
			entity.setStreetAddress(dto.getStreetAddress());
			entity.setCity(dto.getCity());
			entity.setState(dto.getState());
			entity.setPostalCode(dto.getPostalCode());
			entites.add(entity);

		}
		return entites;
	}

}
