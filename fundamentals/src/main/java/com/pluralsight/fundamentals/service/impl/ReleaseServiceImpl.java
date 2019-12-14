package com.pluralsight.fundamentals.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.fundamentals.entity.Release;
import com.pluralsight.fundamentals.repository.ReleaseRepository;
import com.pluralsight.fundamentals.service.ReleaseService;

@Service
public class ReleaseServiceImpl implements ReleaseService {
	@Autowired
	private ReleaseRepository releaseRepository;

	@Override
	public List<Release> listReleases() {
		return (List<Release>) releaseRepository.findAll();
	}

}
