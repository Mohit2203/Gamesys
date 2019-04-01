/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Mohit
 *
 */
@Entity
@Table(name = "user")
public class UserDetails {
	
	private String userName;
	private String passwords;
	private String dateOfBirth;
	private String ssn;
	
	public UserDetails(String userName,String passwords, String dateOfBirth, String ssn) {
        super();
        this.userName = userName;
        this.passwords=passwords;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
        }

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the passwords
	 */
	public String getPasswords() {
		return passwords;
	}

	/**
	 * @param passwords the passwords to set
	 */
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	

}
