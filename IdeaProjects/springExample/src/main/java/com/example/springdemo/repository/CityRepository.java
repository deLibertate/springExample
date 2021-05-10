package com.example.springdemo.repository;

import com.example.springdemo.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {
}
