package com.voting.exceptions;

import com.voting.service.NotEligibleException;

public class NoVoterIDException extends NotEligibleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoVoterIDException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoVoterIDException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
