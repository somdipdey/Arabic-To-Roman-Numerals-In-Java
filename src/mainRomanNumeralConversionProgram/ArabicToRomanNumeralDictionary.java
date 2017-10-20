package mainRomanNumeralConversionProgram;
import java.util.*;

/* 
 * This class, ArabicToRomanNumeralDictionary, holds the translation of Arabic to Roman numeral
 * in the form of map <Key, Value>. 
 * 
 * Roman numerals: https://en.wikipedia.org/wiki/Roman_numerals
 * The numeric system represented by Roman numerals originated in ancient Rome and remained 
 * the usual way of writing numbers throughout Europe well into the Late Middle Ages. 
 * Numbers in this system are represented by combinations of letters from the Latin alphabet. 
 * Roman numerals, as used today, are based on seven symbols as follows:
 * 
 * Symbol	I	V	X	L	C	D	M
 * Value	1	5	10	50	100	500	1,000
 *
 * In a few specific cases, to avoid confusing and hard to read numbers with four characters 
 * repeated in succession (such as IIII or XXXX), 
 * subtractive notation is used: as in this table:
 * Number	4	9	40	90	400	900
 * Notation	IV	IX	XL	XC	CD	CM
 * 
 * So the dictionary, which is used for this program to explicitly 
 * convert Arabic numeral to Roman numeral is as follows:
 * 
 * Number       	1 	4	5  	9	10	40	50	90		100		400		500		900		1,000
 * Roman Notation	I	IV	V	IX	X	XL	L	XC		C		CD		D		CM		M
 */

public class ArabicToRomanNumeralDictionary {
	public static TreeMap map = new TreeMap();
	
	static{
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");  
	}
}
