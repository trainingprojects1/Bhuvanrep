package com.java.srp;

public class JobDetail {
	private String job;
	private String company;
	private String location;
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "JobDetail [job=" + job + ", company=" + company + ", location=" + location + "]";
	}
	

}
