package com.groupBuy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.groupBuy.model.Item;
import com.groupBuy.repository.MarketRepository;

@Service
public class MarketService {
	@Autowired
    private MarketRepository marketRepository;

    public List<Item> getAllItems() {
        return marketRepository.findAll();
    }

    public Item addItem(Item item) {
        return marketRepository.save(item);
    }
}
