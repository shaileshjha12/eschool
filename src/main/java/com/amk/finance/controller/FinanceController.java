package com.amk.finance.controller;


import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amk.finance.dto.FeeStructureDto;
import com.amk.finance.repositories.ClassFeeRepository;
import com.amk.finance.service.FinanceService;

@RestController()
@RequestMapping("/finance")
public class FinanceController {
	@Autowired
	private ClassFeeRepository classFeeRepository;
	
	@Autowired
	private FinanceService finService;
	
	@GetMapping(value={"getFeeStructure/{grade}","/getFeeStructure/{grade}/{year}"}, produces = "application/json")
	public ResponseEntity<FeeStructureDto> getFeeStructure(@PathVariable(name="grade") Integer grade, @PathVariable(name="year",required = false) Integer year) {
		if(year== null) {
			Calendar c = Calendar.getInstance();
			 year = c.get(Calendar.YEAR);
			
		}
		FeeStructureDto feeStructure = finService.getFeeStructure(grade,year);
		System.out.println("Value Recieved");
		ResponseEntity<FeeStructureDto> response = new ResponseEntity<FeeStructureDto>(feeStructure,HttpStatus.OK);
		
		return response;
	}

}
