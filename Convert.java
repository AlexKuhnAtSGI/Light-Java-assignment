//COMP 1006A/1406A Assignment 1 Problem 2
//By Alexander Kuhn, ID# 101023154, July 11, 2016
//Purpose: This class converts a given numerical grade to a letter grade
//Inputs: When running the program, provide one number grade (you can provide more than one, but the main method will only convert the first)
//Outputs: A single letter grade

public class Convert{
  
  public static String convertToLetter(double grade){
    //This is the real meat of the program: I only added the main method for testing
    //It's just a simple brute force algorithm that checks for every possible grade and returns the corresponding letter
	//Note that not every grade from this course would be valid input for this class: 1006A/1406A students can get grades of up to 105, but the criteria specifically prohibit assigning a letter value to anything above 100
    //If the grade submitted is impossible, it returns the string "Invalid"
    String letterGrade = new String();
    if ((grade >= 90) && (grade <= 100)) {
      letterGrade = "A+";
    }
    else if ((grade >= 85) && (grade < 90)) {
      letterGrade = "A";
    }
    else if ((grade >= 80) && (grade < 85)) {
      letterGrade = "A-";
    }
    else if ((grade >= 77) && (grade < 80)) {
      letterGrade = "B+";
    }
    else if ((grade >= 73) && (grade < 77)) {
      letterGrade = "B";
    }
    else if ((grade >= 70) && (grade < 73)) {
      letterGrade = "B-";
    }
    else if ((grade >= 67) && (grade < 70)) {
      letterGrade = "C+";
    }
    else if ((grade >= 63) && (grade < 67)) {
      letterGrade = "C";
    }
    else if ((grade >= 60) && (grade < 63)) {
      letterGrade = "C-";
    }
    else if ((grade >= 57) && (grade < 60)) {
      letterGrade = "D+";
    }
    else if ((grade >= 53) && (grade < 57)) {
      letterGrade = "D";
    }
    else if ((grade >= 50) && (grade < 53)) {
      letterGrade = "D-";
    }
    else if ((grade >= 0) && (grade < 50)) {
      letterGrade = "F";
    }
    else {
      letterGrade = "Invalid";
    }

    return letterGrade; 
  }
  
  //public static void main (String[] args){
    //double grade = Double.parseDouble(args[0]);
    //System.out.println(convertToLetter(grade));
  //Because having a main method is not in the criteria, I commented this out
  //}
  
}