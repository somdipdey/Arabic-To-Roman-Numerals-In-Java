package testsForRomanNumeralConversion;
import java.util.*;

/*
 * Copyright @ Somdip Dey, 2017
 * www.somdipdey.com
 * GitHub Profile: https://github.com/somdipdey
 * 
 * This program tests if the implementation of ArabicToRomanNumeralGenerator class is correct or not.
 * If all the test cases pass with flying colours then it means that the implementation is correct
 */

public class Program {
	public static void main(String[] args){
		
		// Test to check if the program throws exception when less than 1 is passed for conversion
		if(TestForLessThanOne.LessThanOne()) System.out.println("TestForLessThanOne: Passed");
		else System.out.println("TestForLessThanOne: Failed");
		
		// Test to check if the program throws exception when more than 3999 is passed for conversion
		if(TestForMoreThanThreeThousandandNineHundredandNinetyNine.MoreThan3999()) System.out.println("TestForMoreThanThreeThousandandNineHundredandNinetyNine: Passed");
		else System.out.println("TestForMoreThanThreeThousandandNineHundredandNinetyNine: Failed");
		
		// Test to check if the program can successfully convert 
		// some of the common Arabic numerals to Roman ones
		if(TestForArabicToRomanNumeral.ConvertedProperly()) System.out.println("TestForArabicToRomanNumeral: Passed");
		else System.out.println("TestForArabicToRomanNumeral: Failed");
	}
}
