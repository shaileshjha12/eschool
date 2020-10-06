package com.amk.finance.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FeeStructureDto {

	private int fid;

	private int grade;

	private String admissionFee;

	private String tutionFee;

	private String developmentFee;

	private String schoolDress;

	private String bookCharges;

	private String annualCharges;

	private String examinationFee;

	private String computerFee;

	private String travelCharges;

	private String otherActivity;

	private String total;

	private String month;

	private int year;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(String admissionFee) {
		this.admissionFee = admissionFee;
	}

	public String getTutionFee() {
		return tutionFee;
	}

	public void setTutionFee(String tutionFee) {
		this.tutionFee = tutionFee;
	}

	public String getDevelopmentFee() {
		return developmentFee;
	}

	public void setDevelopmentFee(String developmentFee) {
		this.developmentFee = developmentFee;
	}

	public String getSchoolDress() {
		return schoolDress;
	}

	public void setSchoolDress(String schoolDress) {
		this.schoolDress = schoolDress;
	}

	public String getBookCharges() {
		return bookCharges;
	}

	public void setBookCharges(String bookCharges) {
		this.bookCharges = bookCharges;
	}

	public String getAnnualCharges() {
		return annualCharges;
	}

	public void setAnnualCharges(String annualCharges) {
		this.annualCharges = annualCharges;
	}

	public String getExaminationFee() {
		return examinationFee;
	}

	public void setExaminationFee(String examinationFee) {
		this.examinationFee = examinationFee;
	}

	public String getComputerFee() {
		return computerFee;
	}

	public void setComputerFee(String computerFee) {
		this.computerFee = computerFee;
	}

	public String getTravelCharges() {
		return travelCharges;
	}

	public void setTravelCharges(String travelCharges) {
		this.travelCharges = travelCharges;
	}

	public String getOtherActivity() {
		return otherActivity;
	}

	public void setOtherActivity(String otherActivity) {
		this.otherActivity = otherActivity;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
