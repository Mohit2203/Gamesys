/**
 * 
 */
package com.gamesys.test.GamesysSpringBootUserRegistration.model;
/**
 * @author Mohit
 *
 */
public class Message {

	private String message;
	private String code;

	public Message() {

	}

	public Message(String message,String code) {
		super();
		this.message=message;
		this.code=code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
