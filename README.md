# Arabic-To-Roman-Numerals
Use this project to convert Arabic numerals to Roman numerals easily and efficiently

# Structure of files in this directory:

This is the Root directory
::> bin (contains two subfolders)

    -> mainRomanNumeralConversionProgram (contains 4 files)
    
    -> testsForRomanNumeralConversion (contains 4 files)

::> src (contains two subfolders and one README.txt)

    -> mainRomanNumeralConversionProgram (contains 4 files)
    
    -> testsForRomanNumeralConversion (contains 4 files)
    
    -> README.txt (More details and further explanation)
    

Details of the project structure can be found from here --> https://github.com/somdipdey/Arabic-To-Roman-Numerals/blob/master/STRUCTURE-README.txt

## bin/MainRomanNumeralConversionProgram 
is the sub folder containing program executables for ArabicToRomanNumeralGenerator

## bin/TestsForRomanNumeralConversion 
is the sub folder containing program executables to test the execution of the solution

## src/MainRomanNumeralConversionProgram 
is the sub folder containing all the java files for ArabicToRomanNumeralGenerator

## src/TestsForRomanNumeralConversion 
is the sub folder containing all the java files to test the execution of the solution

# The Challenge Solved Here -> Coding Kata - Roman Numerals
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

Compile and run the Program.java and other associated .java files in src/MainRomanNumeralConversionProgram to see the solution in action.

Compile and run the Program.java and other associated .java files in src/TestsForRomanNumeralConversion to perform tests to check quality of the solution.

To compile the solution using ‘javac’ then use the following command in your terminal:

$ javac -d .  Program.java ArabicToRomanNumeralGenerator.java ArabicToRomanNumeralDictionary.java RomanNumeralGenerator.java

—————————————————
To compile the tests for the solution using ‘javac’ then use the following command in your terminal:

$ javac -d .  Program.java TestForArabicToRomanNumeral.java TestForLessThanOne.java TestForMoreThanThreeThousandandNineHundredandNinetyNine.java

