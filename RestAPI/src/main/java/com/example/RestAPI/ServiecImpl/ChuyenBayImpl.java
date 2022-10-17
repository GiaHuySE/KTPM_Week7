package com.example.RestAPI.ServiecImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestAPI.Entity.ChuyenBay;
import com.example.RestAPI.Repository.ChuyenBayRepository;
import com.example.RestAPI.Service.ChuyenBayService;

@Service
public class ChuyenBayImpl implements ChuyenBayService {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> listChuyenBay() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findAll();
	}

}
