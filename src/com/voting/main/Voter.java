package com.voting.main;

import java.util.Scanner;

import com.voting.exceptions.LocalityNotFoundException;
import com.voting.exceptions.NoVoterIDException;
import com.voting.exceptions.UnderAgeException;
import com.voting.service.ElectionBooth;
import com.voting.service.NotEligibleException;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectionBooth booth = new ElectionBooth();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter your age : ");
		int age = scanner.nextInt();

		try {
			booth.checkAge(age);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());

		}

		System.out.println("Enter Location : ");
		String locality = scanner.next();

		try {
			booth.checkLocality(locality);
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());

		}

		System.out.println("Enter VoterID Number : ");
		int voterId = scanner.nextInt();

		try {
			booth.checkVoterId(voterId);
		} catch (NoVoterIDException e) {
			System.out.println(e.getMessage());

		}

		try {
			booth.checkEligibility(age, locality, voterId);
		} catch (NotEligibleException e) {
			System.out.println(e.getMessage());

		}
		scanner.close();
	}

}
