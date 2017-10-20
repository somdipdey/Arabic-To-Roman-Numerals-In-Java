package testsForRomanNumeralConversion;
import mainRomanNumeralConversionProgram.ArabicToRomanNumeralGenerator;

/*
 * This test tries to check whether an exception is thrown if the Arabic numeral, which is less than 1, passed
 * to the program for the conversion to Roman numeral. If an exception is thrown then the test returns true, 
 * which means this test is passed successfully.
 * 
 */

public class TestForLessThanOne {
	public static boolean LessThanOne(){
		ArabicToRomanNumeralGenerator romanGenerator = new ArabicToRomanNumeralGenerator();
		
		// Try catch to test whether an exception is thrown or not
		try{
			romanGenerator.generate(0);
		}
		catch(Exception ex){ return true; }
		
		return false;
	}
}
