package com.example.offerlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.offerlist.entites.Response;
import com.example.offerlist.services.OfferService;

@RestController
public class MyController {
@Autowired
private OfferService offerService;
	
	// get offers
	
	@GetMapping("/offerList")
	public Response getoffers() {
		return this.offerService.getOffers();
//		Response response = new Response(1, 0, "I", "Success", list);
//		return response;
	}
}
