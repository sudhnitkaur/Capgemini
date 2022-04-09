package com.sudhnit.Q5.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sudhnit.Q5.Entities.employee;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends CrudRepository<employee,Integer>{}