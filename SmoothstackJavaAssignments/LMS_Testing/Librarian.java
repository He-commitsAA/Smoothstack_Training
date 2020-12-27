package com.ss.sf.lms.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.ss.sf.lms.dao.BookCopyDAO;
import com.ss.sf.lms.dao.BookDAO;
import com.ss.sf.lms.dao.LibraryBranchDAO;
import com.ss.sf.lms.jdbc.Book;
import com.ss.sf.lms.jdbc.BookCopy;
import com.ss.sf.lms.jdbc.LibraryBranch;

/**
 * @author William
 *
 */
public class Librarian extends User {

	public List<String> libOneOptions = new ArrayList<>(Arrays.asList("Enter Branch you manage"));
	public List<String> libThreeOptions = new ArrayList<>(
			Arrays.asList("Update the details of the Library", "Add copies of Book to the Branch"));

	public void showLibOne() {
		Integer c = this.makeMenu(this.libOneOptions);
		switch (c) {
		case 1:
			this.showLibTwo();
			break;
		case 2:
			System.out.println("You quit.");
			break;
		}
	}

	public void showLibTwo() {

		LibraryBranchDAO myLBDAO = new LibraryBranchDAO();
		List<String> branchNames = new ArrayList<>();
		List<LibraryBranch> branches = new ArrayList<>();
		try {
			branches = myLBDAO.readLibraryBranches();
			myLBDAO.readLibraryBranches().forEach(b -> {
				branchNames.add(b.getBranchName());
			});
		} catch (IOException io) {
			System.out.println("IOException occured.");
			io.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			System.out.println("ClassNotFoundException occured.");
			cnf.printStackTrace();
		} catch (SQLException sq) {
			System.out.println("SQLException occured.");
			sq.printStackTrace();
		}
		Integer c = this.makeMenu(branchNames);
		if (c == branches.size() + 1) {
			this.showLibOne();
		}
		this.showLibThree(branches.get(c));
	}

	public void showLibThree(LibraryBranch library) {

		Integer c = this.makeMenu(this.libThreeOptions);
		switch (c) {
		case 1:
			this.updateBranchAsLibrarian(library);
			break;
		case 2:
			this.addCopiesAsLibrarian(library);
			break;
		case 3:
			this.showLibTwo();
			break;
		}
	}

	public void updateBranchAsLibrarian(LibraryBranch library) {
		System.out.println("You have chosen to update the Branch with Branch Id: " + library.getBranchId()
				+ " and Branch Name: " + library.getBranchName());
		System.out.println("Enter 'quit' at any prompt to cancel operation");
		System.out.println("Please enter new branch name or enter N/A for no change:");
		String name = "update failed";
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			if (s == "N/A") {
				name = library.getBranchName();
			} else if (s == "quit") {
				this.showLibThree(library);
			} else {
				name = s;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		String address = "update failed";
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			if (s == "N/A") {
				address = library.getBranchAddress();
			} else if (s == "quit") {
				this.showLibThree(library);
			} else {
				address = s;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		library.setBranchName(name);
		library.setBranchAddress(address);
		LibraryBranchDAO myLBDAO = new LibraryBranchDAO();

		try {
			myLBDAO.updateLibraryBranch(library);
		} catch (IOException io) {
			System.out.println("IOException occured.");
			io.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			System.out.println("ClassNotFoundException occured.");
			cnf.printStackTrace();
		} catch (SQLException sq) {
			System.out.println("SQLException occured.");
			sq.printStackTrace();
		}
		this.showLibThree(library);
	}

	public void addCopiesAsLibrarian(LibraryBranch library) {
		System.out.println("Pick the Book you want to add copies of, to your branch:");

		BookDAO myBookDAO = new BookDAO();
		List<Book> allBooks = new ArrayList<>();

		BookCopyDAO myBCDAO = new BookCopyDAO();
		List<BookCopy> branchCopies = new ArrayList<>();

		List<String> allTitles = new ArrayList<>();

		try {
			allBooks = myBookDAO.readBooks();
			myBookDAO.readBooks().forEach(b -> {
				allTitles.add(b.getTitle());
			});
		} catch (IOException io) {
			System.out.println("IOException occured.");
			io.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			System.out.println("ClassNotFoundException occured.");
			cnf.printStackTrace();
		} catch (SQLException sq) {
			System.out.println("SQLException occured.");
			sq.printStackTrace();
		}

		Integer c = this.makeMenu(allTitles);
		if (c == allTitles.size() + 1) {
			this.showLibThree(library);
		}

		List<BookCopy> existingCopies = new ArrayList<>();
		try {
			existingCopies = new ArrayList<>(
					myBCDAO.readBookCopiesByBookIdAndBranchId(allBooks.get(c).getBookId(), library.getBranchId()));
		} catch (IOException io) {
			System.out.println("IOException occured.");
			io.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			System.out.println("ClassNotFoundException occured.");
			cnf.printStackTrace();
		} catch (SQLException sq) {
			System.out.println("SQLException occured.");
			sq.printStackTrace();
		}
		Integer currentCopies;
		if(existingCopies.size()==0) {
			currentCopies = 0;
		}else {
			currentCopies = existingCopies.get(0).getNoOfCopies();
		}
		BookCopy myCopies = existingCopies.get(0);
		System.out.println("Existing Number of Copies: "+ currentCopies);
		System.out.println("Enter new number of copies: ");
		Integer newCopies = currentCopies;
		try(Scanner sc = new Scanner(System.in)){
			newCopies = sc.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		myCopies.setNoOfCopies(newCopies);
		
		try {
			myBCDAO.updateBookCopy(myCopies);
		} catch (IOException io) {
			System.out.println("IOException occured.");
			io.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			System.out.println("ClassNotFoundException occured.");
			cnf.printStackTrace();
		} catch (SQLException sq) {
			System.out.println("SQLException occured.");
			sq.printStackTrace();
		}
		
		this.showLibThree(library);

	}

}
