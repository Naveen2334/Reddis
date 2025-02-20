package com.naveen.Redis.model;

import lombok.Data;

@Data
public class User {
	
	private long id;
	private String firstName;
	private String lastName;
	private String emailid;
	private int age;

}
