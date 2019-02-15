package com.stackroute.keepnote.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


/*
 * Please note that this class is annotated with @Document annotation
 * @Document identifies a domain object to be persisted to MongoDB.
 *  */
@Entity
public class User {

	/*
	 * This class should have five fields (userId,userName,
	 * userPassword,userMobile,userAddedDate). Out of these five fields, the field
	 * userId should be annotated with @Id (This annotation explicitly specifies the document
	 * identifier). This class should also contain the getters and setters for the
	 * fields, along with the no-arg , parameterized constructor and toString
	 * method.The value of userAddedDate should not be accepted from the user but
	 * should be always initialized with the system date.
	 */
	@Id
	private String userId;
	private String userName;
    private String firstName;
    private String lastName;
	private String userPassword;
	private String userMobile;
	private Date userAddedDate;
	private String userRole;
	
	public User() {
	}

	public User(String userId, String userName, String firstName, String lastName, String userPassword,
			String userMobile, Date userAddedDate, String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userPassword = userPassword;
		this.userMobile = userMobile;
		this.userAddedDate = userAddedDate;
		this.userRole = userRole;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public Date getUserAddedDate() {
		return userAddedDate;
	}

	public void setUserAddedDate(Date userAddedDate) {
		this.userAddedDate = userAddedDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", userPassword=" + userPassword + ", userMobile=" + userMobile + ", userAddedDate="
				+ userAddedDate + ", userRole=" + userRole + "]";
	}
	 
}
