package mainRomanNumeralConversionProgram;
import java.util.*;

import mainRomanNumeralConversionProgram.ArabicToRomanNumeralDictionary;
import mainRomanNumeralConversionProgram.RomanNumeralGenerator;


/*
 * This class, ArabicToRomanNumeralGenerator, implements the interface RomanNumeralGenerator
 * to convert Arabic numeral to Roman numeral.
 * 
 * The approach explained as follows:
 * If this challenge is tried to be solved using if-else then managing and maintaining the code
 * will become challenging. Not to mention that if-else operation has a time complexity of O(N) for worst case and 
 * O(1) for average case. Another alternative and upgrade to if-else can be using switch statements, 
 * but again  that too has a complexity of O(N) or O(1) depending on implementation. The only possible best case
 * implementation is by using the concept of Map. And in this solution TreeMap is used because by default the map
 * is sorted by the natural ordering of the keys (which is the Arabic numeral) and an in-built method named 
 * floorKey(Key) can be used to fetch the closest possible (equal or less than but closest) key-value, which
 * in fact can be used for recursively calling the function till the Arabic numeral is processed to generate 
 * Roman numeral. TreeMap also guarantees log(N) time complexity for get/put operations.
 *  
 */

public class ArabicToRomanNumeralGenerator implements RomanNumeralGenerator {

	// Initiating the ArabicToRomanNumeralDictionary class so that the Arabic to Roman
	// key value mapping can be used later in this class for explicit conversion
	private ArabicToRomanNumeralDictionary dictionary = new ArabicToRomanNumeralDictionary();
	
	@Override // Implementing the method generate of interface RomanNumeralGenerator
	public String generate(int number) {
		
		// Check if the passed number parameter falls within the range of 1 to 3999, inclusive
		// or else throw NumberFormatException to the user
		if(number < 1) throw new IllegalArgumentException("Only supports numbers between 1 and 3999."+
						"The provided number is less than 1.");
		if(number > 3999) throw new IllegalArgumentException("Only supports numbers between 1 and 3999."+
				"The provided number is more than 3999.");
		
		// Fetch the closest Arabic number from the ArabicToRomanNumeralDictionary map
		int arabicNumberFound = (int)(dictionary.map.floorKey(number));
		
		// If the passed Arabic number if already found from the ArabicToRomanNumeralDictionary map
		// then return the Roman conversion of that Arabic number
		if(arabicNumberFound == number) return dictionary.map.get(number).toString();
		
		// Or else keep iterating through the Arabic numbers till the exact match from the
		// ArabicToRomanNumeralDictionary map is found. Here the matching and mapping process
		// is iterated using recursion.
		return dictionary.map.get(arabicNumberFound).toString() + generate(number - arabicNumberFound);
	}

}
