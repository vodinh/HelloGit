package com.freemarker;
/**
 * Test git
 * edit when file is already in staged area.
 * @author Jason
 *
 */

public class User {
	private String firstname;
	private String lastname;

	public User(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public User() {
		super();
	}
	/**
	 * change from jasonvo user
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * change from jasonvo user
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * change from jasonvo user
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * change from jasonvo user
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
