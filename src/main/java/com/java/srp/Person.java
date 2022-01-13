package com.java.srp;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private int id;
	private String name;
	@Autowired
	private JobDetail jobDetails;
	private Family familyDetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JobDetail getJobDetails() {
		return jobDetails;
	}
	public void setJobDetails(JobDetail jobDetails) {
		this.jobDetails = jobDetails;
	}
	public Family getFamilyDetails() {
		return familyDetails;
	}
	public void setFamilyDetails(Family familyDetails) {
		this.familyDetails = familyDetails;
	}
	public void showAllInfo() {
		  System.out.println(familyDetails);
		  System.out.println(jobDetails);
		  System.out.println("Id  " +id+ " Name  " +name);
		 }


}
