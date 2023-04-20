package com.jpa2.jpa2.inheritanceMapping;

import org.springframework.data.repository.CrudRepository;

public interface VehicleRepo extends CrudRepository<Vehicle,String> {
}