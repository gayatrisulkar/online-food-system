package com.mphasis.onlinefoododering.OnlineFoodOdering.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.onlinefoododering.OnlineFoodOdering.exception.ResourceNotFoundException;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Registration;
import com.mphasis.onlinefoododering.OnlineFoodOdering.service.RegistrationService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class RegistrationController {

	@Autowired
	RegistrationService regService;

//http://localhost:9080/api/v1/getAllRegistration
	@GetMapping("/getAllRegistration")
	public List<Registration> getRegistration() {
		List<Registration> regList = regService.fetchRegistration();

		return regList;

	}

	// http://localhost:8080/api/v1/getRegistration/1
	@GetMapping("/getRegistration/{user_id}")
	public ResponseEntity<Registration> getRegistrationById(@PathVariable("user_id") int user_id)
			throws ResourceNotFoundException {
		Registration registration = regService.getRegistration(user_id);
		return ResponseEntity.ok().body(registration);
	}

	// http://localhost:8080/api/v1/saveRegistration
	@PostMapping("/saveRegistration")
	public Registration addRegistration(@RequestBody Registration reg) {

		Registration registration = regService.saveRegistration(reg);

		// return new ResponseEntity<>("Registration done successfully", HttpStatus.OK);
		return registration;
	}

	// http://localhost:8080/api/v1/updateEmployee/2
	@PutMapping("/updateRegistration/{id}")
	public ResponseEntity<Registration> updateRegistration(@PathVariable("id") int registrationId,
			@RequestBody Registration registrationDetails) throws ResourceNotFoundException {
		Registration registration = regService.getRegistration(registrationId);

		registration.setUserName(registrationDetails.getUserName());
		registration.setEmailId(registrationDetails.getEmailId());
		registration.setPhoneNumber(registrationDetails.getPhoneNumber());
		registration.setPassword(registrationDetails.getPassword());
		registration.setAddress(registrationDetails.getAddress());
		final Registration updatedRegistration = regService.saveRegistration(registration);
		return ResponseEntity.ok(updatedRegistration);
	}

//http://localhost:8080/api/v1/deleteRegistration/1
	@DeleteMapping(value = "/deleteRegistration/{user_id}")
	public ResponseEntity<Object> deleteRegistration(@PathVariable("user_id") int user_id) {

		regService.deleteRegistration(user_id);
		return new ResponseEntity<>("Registration deleted successsfully", HttpStatus.OK);
	}
	
}
