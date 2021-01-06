//COMP 1006A/1406A Assignment 1 Problem 1
//By Alexander Kuhn, ID# 101023154, July 11, 2016
//Purpose: This program computes a final mark for COMP 1006/1406A based on the six term marks: assignments, project, tutorials, quizzes, midterm and final exam
//Input: When running the program, provide precisely 6 command line arguments (integers or decimal numbers only) or the program will fail to properly execute
//Outputs: Prints the final mark as a string

public class Grades{
  
  public static double computeGrade(String[] grades){
    //This method computes the user's grade based on their 6 command line arguments (their marks throughout the course)
    //These arguments may be integers or decimals, but must be provided in the order Assignments, Project, Tutorials, Quizzes, Midterm, Final
    //It returns their final grade as a double based on the weight of each mark: though the sum of all weighted marks can exceed 100, this method will convert such a sum to exactly 100
    //For example, if given the arguments 75.1 30 45.1 77 65.2 72.3, it will return 65.22
    //It will do otherwise, however, if the weight of the user's combined Midterm and Final marks is under 25.0
    //In that case, it returns either twice the sum of the user's combined Midterm and Final marks or the sum of all weighted marks (whichever is lowest)
    //For example, if given the arguments 99 90 95.1 97 51.1 37.2, it will return 41.37
    double computedGrade = 0.0;
    // computedGrade is really defined later in the method, but it occurs in an if/else statement set, so I have to give it a token value here
    // If for some reason my if/else didn't execute, and this wasn't defined here, the end of the program would attempt to return a value that did not exist
    
    double weightedAssignments = Double.parseDouble(grades[0]) * 0.25;
    double weightedProject = Double.parseDouble(grades[1]) * 0.1;
    double weightedTutorials = Double.parseDouble(grades[2]) * 0.1;
    double weightedQuizzes = Double.parseDouble(grades[3]) * 0.05;
    double weightedMidterm = Double.parseDouble(grades[4]) * 0.15;
    double weightedFinal = Double.parseDouble(grades[5]) * 0.35;
    
    if ((weightedMidterm + weightedFinal) >= 25) {
      computedGrade = Math.min((weightedAssignments + weightedProject + weightedTutorials + weightedQuizzes + weightedMidterm + weightedFinal), 100);
    } 
    else {
      computedGrade = Math.min((2*(weightedMidterm + weightedFinal)), (weightedAssignments + weightedProject + weightedTutorials + weightedQuizzes + weightedMidterm + weightedFinal));
    }

    return computedGrade;
  }



  
  public static String roundGrade(double grade){
    //This method simply rounds the grade computed earlier to a single decimal place
    double roundedGrade = Math.round(grade * 10);
    String roundedGradeString = Double.toString(roundedGrade / 10);
    //Without putting these two equivalences on separate lines, the round function will get rid of ALL decimal places
    //We only want to eliminate the decimal places past the first one

    return roundedGradeString;
  }
  



  
  public static void main(String[] args){

    // check that right number of command line arguments were given
    if( args.length != 6){
      System.out.println("Usage: java Grades A P T Q M F\n\nwhere each is a non-negative number");
      return; // exit program
    }
    
    // args has six elements -- we assume each represents a non-negative number
    
    System.out.println(roundGrade(computeGrade(args)));
    
    
    
  }
}