//COMP 1006A/1406A Assignment 1 Problem 1
//By Alexander Kuhn, ID# 101023154, July 11, 2016
//Purpose: This program checks to see if Grades.java returns the right answer by checking its output against inputs where the correct answer is already known
//Input: Takes none: it's running Grades.java over predetermined grades
//Output: Only outputs what Grades.java would output, given the test cases in the code's body

import java.util.Arrays;
//Without importing this, I'd have to use a for loop to print every string array in the program
//This lets me use Arrays.toString instead

public class GradesTesting{
  
  public static void main(String[] args){

    String[] input = new String[] {"75.1", "30", "45.1", "77", "65.2", "72.3"};
    System.out.println("Test 0: " + (Arrays.toString(input)));
    System.out.println("Expected answer is 65.2");
    System.out.print("Answer obtained is "); 
    Grades.main(input);
    System.out.println("");
    
    input = new String[] {"99", "90", "95.1", "97", "51.1", "37.2"};
    System.out.println("Test 1: " + (Arrays.toString(input)));
    System.out.println("Expected answer is 41.4");
    System.out.print("Answer obtained is "); 
    Grades.main(input);
    System.out.println("");
    
    input = new String[] {"105", "105", "92.1", "95.2", "99.7", "100.1"};
    System.out.println("Test 2: " + (Arrays.toString(input)));
    System.out.println("Expected answer is 100.0");
    System.out.print("Answer obtained is "); 
    Grades.main(input);
    System.out.println("");
    
    input = new String[] {"82.1", "74.7", "67.6", "36.6", "79", "11"};
    System.out.println("Test 3: " + (Arrays.toString(input)));
    System.out.println("Expected answer is 31.4");
    System.out.print("Answer obtained is "); 
    Grades.main(input);
    System.out.println("");
    
    input = new String[] {"12.172", "87.699", "79.558", "4.904", "66.171", "87.245"};
    System.out.println("Test 4: " + (Arrays.toString(input)));
    System.out.println("Expected answer is 60.5");
    System.out.print("Answer obtained is "); 
    Grades.main(input);
    System.out.println("");
    
    return;
  }   
}