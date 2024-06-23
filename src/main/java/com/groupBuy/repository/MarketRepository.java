package com.groupBuy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.groupBuy.model.Item;

public interface MarketRepository extends MongoRepository<Item, String> {

}
