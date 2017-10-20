package testsForRomanNumeralConversion;
import mainRomanNumeralConversionProgram.ArabicToRomanNumeralGenerator;

/*
 * This test tries to check if the Arabic to Roman numeral conversion is correct or not. 
 * If all the examples to generate Roman numbers work correctly then the test returns true. 
 * But if the test fails for any of the number generation cases then the test returns false. 
 * 
 */

public class TestForArabicToRomanNumeral {
	public static boolean ConvertedProperly(){
		ArabicToRomanNumeralGenerator romanGenerator = new ArabicToRomanNumeralGenerator();

		// Test to convert Arabic number: 1 to Roman number
		String arabicToRoman1 = romanGenerator.generate(1);
		if(!arabicToRoman1.equals("I")) return false;
		
		// Test to convert Arabic number: 5 to Roman number
		String arabicToRoman5 = romanGenerator.generate(5);
		if(!arabicToRoman5.equals("V")) return false;
		
		// Test to convert Arabic number: 10 to Roman number
		String arabicToRoman10 = romanGenerator.generate(10);
		if(!arabicToRoman10.equals("X")) return false;
		
		// Test to convert Arabic number: 20 to Roman number
		String arabicToRoman20 = romanGenerator.generate(20);
		if(!arabicToRoman20.equals("XX")) return false;
		
		// Test to convert Arabic number: 1954 to Roman number
		String arabicToRoman1954 = romanGenerator.generate(1954);
		if(!arabicToRoman1954.equals("MCMLIV")) return false;
		
		// Test to convert Arabic number: 1990 to Roman number
		String arabicToRoman1990 = romanGenerator.generate(1990);
		if(!arabicToRoman1990.equals("MCMXC")) return false;
		
		// Test to convert Arabic number: 2014 to Roman number
		String arabicToRoman2014 = romanGenerator.generate(2014);
		if(!arabicToRoman2014.equals("MMXIV")) return false;
		
		// Test to convert Arabic number: 3999 to Roman number
		String arabicToRoman3999 = romanGenerator.generate(3999);
		if(!arabicToRoman3999.equals("MMMCMXCIX")) return false;
		
		return true;
	}
}
