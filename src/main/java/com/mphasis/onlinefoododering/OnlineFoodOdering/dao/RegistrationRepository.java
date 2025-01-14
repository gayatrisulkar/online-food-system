package com.mphasis.onlinefoododering.OnlineFoodOdering.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.Registration;

	@Repository
	public interface RegistrationRepository extends JpaRepository<Registration ,Integer>  {

//		@Query("SELECT e FROM Registration e WHERE e.status =?1") JPQL
//		Collection<Registration> findAllActiveEmployees();
		
	}
