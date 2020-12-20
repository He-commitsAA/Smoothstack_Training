/**
 * 
 */
package com.ss.sf.williamtraining.javadayfive;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 * @author William
 * 
 *         Solves several given problems related to Date-Time API
 *
 */
public class DateTimeAPIProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Length of each month in 2012:");
		int myYear = 2012;
		for (Month month : Month.values()) { // solving for and printing how many days in each month of given year.
			YearMonth myYearMonth = YearMonth.of(myYear, month);
			System.out.printf("%s: %d\n", month, myYearMonth.lengthOfMonth());
		}

		System.out.println();
		System.out.println("Mondays in December of current year:");
		Month myMonth = Month.DECEMBER; // finding and listing all Mondays in month.
		Year currentYear = Year.now();
		String stringYear = currentYear.toString();
		int intYear = Integer.parseInt(stringYear);
		LocalDate theDay = LocalDate.of(intYear, myMonth, 1).with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		Month m = myMonth;
		while (m == myMonth) {
			System.out.println(theDay);
			theDay = theDay.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			m = theDay.getMonth();
		}

		System.out.println();	//Testing whether given date is a Friday the 13th.
		System.out.println(
				"Testing whether given date occurs on Friday the 13th. Please enter date to test (dd-mm-yyyy):");
		Scanner sc = new Scanner(System.in);
		String givenStr = sc.nextLine();
		sc.close();
		String[] dateNumbers = givenStr.split("-");
		int givenDay = Integer.parseInt(dateNumbers[0]);
		int givenMonth = Integer.parseInt(dateNumbers[1]);
		int givenYear = Integer.parseInt(dateNumbers[2]);
		LocalDate dateToTest = LocalDate.of(givenYear, givenMonth, givenDay);
		if (dateToTest.getDayOfWeek() == DayOfWeek.FRIDAY) {
			System.out.println("It IS a Friday the 13th!");
		} else {
			System.out.println("Nope, NOT a Friday the 13th! Lucky you!");
		}
	}
}