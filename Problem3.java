//COMP 1006A/1406A Assignment 1 Problem 3
//By Alexander Kuhn, ID# 101023154, July 11, 2016
//Purpose: This class computes the length of a longest streak of consecutive true occurrences in the input argument values
//Inputs: When running the program, provide only boolean true/false arguments separated by spaces
//Outputs: A single integer, representing the length of the longest streak of consecutive true occurrences in the input argument values

public class Problem3 {
  
  public static int longestStreak(boolean[] values) {
    int count = 0;
    int highestCount = 0;
    
    for (int i = 0; i < values.length; i += 1){
      if (values[i] == true) {
        count += 1;
        if (count >= highestCount) {
          highestCount = count;
        }
      }
      else {
        count = 0;
      }
    }

    return highestCount;
    
  }
  
  //public static void main (String[] args){
    //boolean[] values = new boolean[args.length];
    //for (int i = 0; i < args.length; i += 1) {
       //values[i] = Boolean.parseBoolean(args[i]);
    //}
    //System.out.println(longestStreak(values));
  //Because having a main method is not in the criteria, I commented this out
  //}
}