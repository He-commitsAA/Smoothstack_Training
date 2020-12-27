/**
 * 
 */
package com.ss.sf.lms.service;

import java.util.List;
import java.util.Scanner;

/**
 * @author William
 *	Abstract User class that all classes of user extend.
 */
public abstract class User {
	
	/*
	 * menuMaker() speeds up the creation of menus with options and ensures that each menu has a "Quit to previous" option at the bottom.
	 * It also takes user input.
	 */
	
	public Integer makeMenu(List<String> options) {
	
		System.out.println("Please choose an option:");
		int i = 1;
		for(String o: options) {
			System.out.println(i+") "+o);
			i++;
		}
		System.out.println(i+") Quit to previous");
		Integer choice = 0;
		try(Scanner sc = new Scanner(System.in)){
			choice = sc.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return choice;
	}

}
