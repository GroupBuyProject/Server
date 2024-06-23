package com.groupBuy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupBuy.model.Item;
import com.groupBuy.service.MarketService;

@RestController
@RequestMapping("/api/markets")
public class MarketController {
	 
	    private MarketService marketService;
	    
	    @Autowired
	    public MarketController(MarketService marketService) {
	        this.marketService = marketService;
	    }

	    @GetMapping
	    public List<Item> getAllItems() {
	        return marketService.getAllItems();
	    }

	    @PostMapping
	    public Item addItem(@RequestBody Item item) {
	        return marketService.addItem(item);
	    }

}
