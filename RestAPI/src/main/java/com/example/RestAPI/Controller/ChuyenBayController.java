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
}
