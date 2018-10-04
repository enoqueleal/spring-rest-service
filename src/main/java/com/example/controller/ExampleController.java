package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ExampleResponse;

/**
 * Example controller class
 * 
 * @author Enoque Leal
 *
 */
@CrossOrigin
@RestController
public class ExampleController {

	private static final String STATUS_UP = "UP";

	/**
	 * Example metodo for GET status request
	 * 
	 * @return
	 */
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ResponseEntity<ExampleResponse> status() {
		return new ResponseEntity<ExampleResponse>(new ExampleResponse(STATUS_UP, 200), HttpStatus.OK);
	}

}
