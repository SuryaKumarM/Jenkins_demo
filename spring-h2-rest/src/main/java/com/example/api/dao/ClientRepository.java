package com.example.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.api.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
	@Query(nativeQuery = true, value = "select * from Client where consumer=?1")
	List<Client> getConsumerByName (String consumer);
	

}
