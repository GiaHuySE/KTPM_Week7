package com.example.RestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestAPI.Entity.ChuyenBay;
import com.example.RestAPI.Service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	@Autowired
	private  ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyenbay")
	public ResponseEntity<Object> getChuyenBays(){
		List<ChuyenBay> chuyenBayList = chuyenBayService.listChuyenBay();
		return new ResponseEntity<>(chuyenBayList,HttpStatus.OK);
	}
	
	@GetMapping("/chuyenbayDaD")
	public ResponseEntity<Object> getChuyenBaysDenDAD(){
		List<ChuyenBay> chuyenBayList = chuyenBayService.chuyenBayDenDAD();
		return new ResponseEntity<>(chuyenBayList,HttpStatus.OK);
	}
	
	@GetMapping("/chuyenbaySGtoiBMT")
	public ResponseEntity<Object> getChuyenBaysSGtoiBMT(){
		List<ChuyenBay> chuyenBayList = chuyenBayService.chuyenBaySgDenBmt();
		return new ResponseEntity<>(chuyenBayList,HttpStatus.OK);
	}
	
	@GetMapping("/chuyenbayDoDaiHon8VaNhoHon10")
	public ResponseEntity<Object> getChuyenBaysDoDaiHon8VaNhoHon10(){
		List<ChuyenBay> chuyenBayList = chuyenBayService.doDaiNhoHon10kVaLonHon8k();
		return new ResponseEntity<>(chuyenBayList,HttpStatus.OK);
	}
}
