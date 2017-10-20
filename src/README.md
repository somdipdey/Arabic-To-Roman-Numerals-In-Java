## Coding Kata - Roman Numerals
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
	----------------------------------------------------------
	----------------------------------------------------------
	Guide to this solution/project ::::>
	
	In this src folder you will find two Java projects, which solves the aforementioned challenge. The project with name, MainRomanNumeralConversionProgram, implements the RomanNumeralGenerator interface and the Program.java file is the main entry point to that project. Just compile and run the Program.java file to see the implementation in action. Eclipse IDE is used to compile and run these projects, so it is advisable that you use similar IDE to compile and run Program.java file.
	
	In the project named, TestsForRomanNumeralConversion, you will find test cases to check if the implementation of RomanNumeralGenerator interface is correct or not. In this project Program.java is the entry point. So just compile and run the Program.java to check whether all the test cases pass successfully or not.

## Note: 
To compile the solution using ‘javac’ then use the following command in your terminal:

$ javac -d .  Program.java ArabicToRomanNumeralGenerator.java ArabicToRomanNumeralDictionary.java RomanNumeralGenerator.java

—————————————————
To compile the tests for the solution using ‘javac’ then use the following command in your terminal:

$ javac -d .  Program.java TestForArabicToRomanNumeral.java TestForLessThanOne.java TestForMoreThanThreeThousandandNineHundredandNinetyNine.java

