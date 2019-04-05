/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import com.gamesys.test.GamesysSpringBootUserRegistration.Validator.DateValueMatch;

/**
 * @author Mohit
 *
 */
@Entity
@Table(name = "user")
@Access(value=AccessType.FIELD)
public class UserDetails {
	
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(generator = "gen")
	private long id;
	
	@NotNull(message ="Username cannot be empty")
	@Size(min = 5, max = 10, message = "Username must have 5-10 characters")
	private String userName;
	@NotNull(message ="Password cannot be empty")
	@Size(min = 5, max = 10, message = "Password must have 5-10 characters")
	private String passwords;
	//@DateValueMatch
	@NotNull(message ="Please enter the date in yyyy-MM-dd format")
	private String dateOfBirth;
	@NotNull(message ="SSN cannot be empty")
	@Size(min = 5, max = 10, message = "SSN must have 5-10 characters")
	private String ssn;
	
	
	public UserDetails(String userName,String passwords, String dateOfBirth, String ssn,long id) {
        super();
        this.userName = userName;
        this.passwords=passwords;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
        this.id=id;
        }

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


}
