package com.sudhnit.Q7.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sudhnit.Q7.model.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order,String> {
}
