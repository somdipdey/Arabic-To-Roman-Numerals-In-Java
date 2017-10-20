package mainRomanNumeralConversionProgram;
import java.util.*;

import mainRomanNumeralConversionProgram.ArabicToRomanNumeralGenerator;

/*
 * Copyright @ Somdip Dey, 2017
 * www.somdipdey.com
 * GitHub Profile: https://github.com/somdipdey
 * 
 * The challenge as presented here -->
 * 
 * BBC Coding Kata - Roman Numerals::
 * 
	The purpose of this exercise is not simply to solve the problem; instead, we are interested in how you approach the problem.
	Please complete the coding exercise and then submit the code listing to your email contact at the BBC.  Please explain your approach, assumptions made, or caveats to your solution and add these to the email.
	We are particularly interested in the following:
	- Code quality
	- Code readability
	- Testing
	 
	The problem -->
	In whatever language you prefer, write a class that implements the following interface (example given in Java):
	public interface RomanNumeralGenerator {
	   public String generate(int number); 
	}
	For example, see the following sample inputs and outputs: 
	1 = “I” 
	5 = “V” 
	10 = “X” 
	20 = “XX” 
	3999 = “MMMCMXCIX”
	 
	Caveat: Only support numbers between 1 and 3999 
	For an in-depth description of Roman Numerals, see 
	
	http://en.wikipedia.org/wiki/Roman_numerals
 * 
 */


public class Program {
	
	// Entry point for the program to convert Arabic numeral to Roman numeral
	public static void main(String[] args){
		
		//various outputs to convert Arabic to Roman numeral and format them desirably 
		programOutput(1); //returns 1 = “I” 
		programOutput(5); //returns 5 = “V” 
		programOutput(10);//returns 10 = “X”
		programOutput(20);//returns 20 = “XX”
		programOutput(3999);//returns 3999 = “MMMCMXCIX”

	}
	
	// This method formats the Roman numeral generation for sake of better understanding
	public static void programOutput(int arabicNumber)
	{
		ArabicToRomanNumeralGenerator romanGenerator = new ArabicToRomanNumeralGenerator();
		System.out.println(arabicNumber + " = \"" + romanGenerator.generate(arabicNumber) + "\"");
	}
}
