
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 10th";
		String dadsBirthday = "September 5th";
		String myBirthday = "May 18th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday=JOptionPane.showInputDialog("Which birthday do you want? Michael's, Dad's, or Mom's?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birthday.equals("Mom's")) {
			System.out.println("Feburary 10th");
		}
		else if (birthday.equals("Dad's")) {
			System.out.println("Spetember 5th");
		}
		else if (birthday.equals("Michael's")){
			System.out.println("May 18th");
		}
		else {
			System.out.println("Who you asking foe?");
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
