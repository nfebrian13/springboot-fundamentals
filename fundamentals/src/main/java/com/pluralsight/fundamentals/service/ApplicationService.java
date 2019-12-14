package com.pluralsight.fundamentals.service;

import java.util.List;

import com.pluralsight.fundamentals.entity.Application;

public interface ApplicationService {

	List<Application> listApplications();
	Application findApplication(long id);
}
