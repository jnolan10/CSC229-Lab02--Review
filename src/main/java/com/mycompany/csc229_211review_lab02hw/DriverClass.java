package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;
/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		//instantiate scanner
                Scanner scan = new Scanner(System.in);
                
                //creating new student object
		Student std1 = new Student("James", (short)20);
		
		//uses user input for GPA
		Double GPA = scan.nextDouble();
                
                //Prints student using toString() method
		System.out.println(std1);
		
	}

}