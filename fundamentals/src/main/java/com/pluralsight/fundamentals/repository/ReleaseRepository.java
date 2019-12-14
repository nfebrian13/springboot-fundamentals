package com.pluralsight.fundamentals.repository;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.fundamentals.entity.Release;

public interface ReleaseRepository extends CrudRepository<Release, Long> {

}
