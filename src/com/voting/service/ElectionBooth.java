package com.voting.service;

import com.voting.exceptions.*;

public class ElectionBooth {

	String localities[] = { "Bangalore", "Singapore", "Tubai" };

	// if age is less than 18 throw exception
	public boolean checkAge(int age) throws UnderAgeException {

		if (age >= 18) {

			return true;

		} else {

			throw new UnderAgeException("Age is less than 18 so you are not eligible to vote ");

		}

	}

	// check if the locality matches with the array
	public boolean checkLocality(String locality) throws LocalityNotFoundException {

		for (String location : localities) {

			if (locality.equals(location)) {

				return true;

			} else {

				throw new LocalityNotFoundException("Locality not match");
			}

		}

		return false;

	}

	// check if id is within 1000 - 9000
	public boolean checkVoterId(int vid) throws NoVoterIDException {

		if (vid >= 1000 && vid <= 9000) {

			return true;

		} else {

			throw new NoVoterIDException("Invalid VoterId ");
		}

	}

	// call all three methods
	// handle the exception
	// throw it to the voter
	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {

		if (checkAge(age) && checkLocality(locality) && checkVoterId(vid)) {

			System.out.println("Eligible for voting");

		} else {
			System.out.println("Not Eligible for Voting");
		}

		return true;
	}

}
