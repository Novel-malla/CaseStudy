package com.novel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.novel.model.Order;
public interface OrderRepository extends MongoRepository<Order, Integer> {

}
