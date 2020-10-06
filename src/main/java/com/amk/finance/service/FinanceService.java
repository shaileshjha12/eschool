package com.amk.finance.service;

import org.springframework.stereotype.Service;

import com.amk.finance.dto.FeeStructureDto;
import com.amk.finance.entity.FeeStructureEntity;


public interface FinanceService {
	
	public FeeStructureDto getFeeStructure(int grade,int year);
	

}
