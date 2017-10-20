package testsForRomanNumeralConversion;
import mainRomanNumeralConversionProgram.ArabicToRomanNumeralGenerator;

/*
 * This test tries to check whether an exception is thrown if the Arabic numeral, which is more than 3999, passed
 * to the program for the conversion to Roman numeral. If an exception is thrown then the test returns true, 
 * which means this test is passed successfully.
 * 
 */

public class TestForMoreThanThreeThousandandNineHundredandNinetyNine {
	public static boolean MoreThan3999(){
		ArabicToRomanNumeralGenerator romanGenerator = new ArabicToRomanNumeralGenerator();
		
		// Try catch to test whether an exception is thrown or not
		try{
			romanGenerator.generate(4000);
		}
		catch(Exception ex){ return true; }
		
		return false;
	}
}
