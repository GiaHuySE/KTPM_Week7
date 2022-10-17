package com.example.RestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestAPI.Entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	
}
