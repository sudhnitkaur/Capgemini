package com.sudhnit.Q8.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sudhnit.Q8.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product,String> {
}
