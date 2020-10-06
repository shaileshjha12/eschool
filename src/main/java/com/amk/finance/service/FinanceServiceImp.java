package com.amk.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amk.finance.dao.FinanceDao;
import com.amk.finance.dto.FeeStructureDto;
import com.amk.finance.entity.FeeStructureEntity;

@Service
public class FinanceServiceImp implements FinanceService {
	@Autowired
	private FinanceDao finDao;
	
	@Override
	public FeeStructureDto getFeeStructure(int grade,int year) {
        FeeStructureEntity entity = finDao.getFeeStructure(grade,year);
        FeeStructureDto dto= new FeeStructureDto();
        dto.setFid(entity.getFid());
        dto.setAdmissionFee(entity.getAdmissionFee());
        dto.setAnnualCharges(entity.getAnnualCharges());
        dto.setBookCharges(entity.getBookCharges());
        dto.setComputerFee(entity.getComputerFee());
        dto.setDevelopmentFee(entity.getDevelopmentFee());
        dto.setExaminationFee(entity.getExaminationFee());
        dto.setGrade(entity.getGrade());
        dto.setMonth(entity.getMonth());
        dto.setOtherActivity(entity.getOtherActivity());
        dto.setSchoolDress(entity.getSchoolDress());
        dto.setTotal(entity.getTotal());
        dto.setTravelCharges(entity.getTravelCharges());
        dto.setTutionFee(entity.getTutionFee());
        dto.setYear(entity.getYear());
        
		return dto;
	}

}
