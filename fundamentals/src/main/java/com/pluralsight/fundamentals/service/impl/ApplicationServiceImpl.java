package com.pluralsight.fundamentals.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.exception.ApplicationNotFoundException;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import com.pluralsight.fundamentals.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	private ApplicationRepository applicationRepository;

	@Override
	public List<Application> listApplications() {
		return (List<Application>) applicationRepository.findAll();
	}

	@Override
	public Application findApplication(long id) {
		Optional<Application> optionalApplication = applicationRepository.findById(id);

		if (optionalApplication.isPresent())
			return optionalApplication.get();
		else
			throw new ApplicationNotFoundException("Application Not Found");
	}

}
