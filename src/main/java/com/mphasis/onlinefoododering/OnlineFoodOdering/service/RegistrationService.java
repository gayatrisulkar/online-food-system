package com.mphasis.onlinefoododering.OnlineFoodOdering.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.onlinefoododering.OnlineFoodOdering.dao.RegistrationRepository;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Registration;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository regRepository;
	
	@Transactional
	public List<Registration> fetchRegistration() {
		List<Registration> regList=regRepository.findAll();
		return regList;
		
	}
	@Transactional
	public Registration saveRegistration(Registration registration) {
		
		return regRepository.save(registration);
		
	}
	@Transactional
	public void updateRegistration(Registration reg) {
		regRepository.save(reg);	
	
	}
	
	@Transactional
	public void deleteRegistration(int user_id) {
		//empRepository.delete(reg);	
		System.out.println("service method called");
		regRepository.deleteById(user_id);
	
	}
	@Transactional 
	  public Registration getRegistration(int id) { 
	  Optional<Registration> optional= regRepository.findById(id);
	  Registration reg=optional.get();
	  return reg;
	  

}
}
