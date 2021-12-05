package com.spring.ex.dto;

import java.sql.Date;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private Date joindate;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoin_date(Date joindate) {
		this.joindate = joindate;
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", join_date=" + joindate
				+ "]";
	}
	
	
	
	
	
	

}
