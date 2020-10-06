package com.amk.finance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "FeeStructure")
public class FeeStructureEntity {
	@Id
	@Column(name="fid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	
	@Column(name="grade")
	private int grade;
	
	
	@Column(name="Admissionfee")
	private String admissionFee;
	
	@Column(name="Tutionfee")
	private String tutionFee;
	
	@Column(name="Developmentfee")
	private String developmentFee;
	
	@Column(name="Schooldress")
	private String schoolDress;
	
	@Column(name="Bookcharges")
	private String bookCharges;
	
	@Column(name="Annualcharges")
	private String annualCharges;
	
	@Column(name="Examinationfee")
	private String examinationFee;
	
	@Column(name="Computerfee")
	private String computerFee;
	
	@Column(name="Travelcharges")
	private String travelCharges;
	
	@Column(name="Otheractivity")
	private String otherActivity;
	
	@Column(name="Total")
	private String total;
	
	@Column(name="Month")
	private String month;
	
	@Column(name="year")
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
