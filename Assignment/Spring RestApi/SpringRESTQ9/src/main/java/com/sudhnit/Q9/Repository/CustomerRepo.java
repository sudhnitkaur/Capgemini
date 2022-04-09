package com.sudhnit.Q9.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sudhnit.Q9.model.customer;

@Repository
public interface CustomerRepo extends CrudRepository<customer,Integer>{}