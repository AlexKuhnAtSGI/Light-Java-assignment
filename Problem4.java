//COMP 1006A/1406A Assignment 1 Problem 4
//By Alexander Kuhn, ID# 101023154, July 11, 2016
//Purpose: This class computes the length and locations of all the  maximal sequences of consecutive true occurrences in values 
//Inputs: provide only boolean true/false arguments separated by spaces: true/false arguments separated by commas will not compute properly
//Outputs: this will print an integer array with one or more elements: the first element is the length of a maximal sequence of consecutive trues in the input array values
//      - The next elements are the indexes of the starting points (in the input array values) of each of the maximal sequences of consecutive trues
//      - Inputting an array with no true values will output [0]
import java.util.Arrays;
//Without importing this, I'd have to use a for loop to print the end result
//This lets me use Arrays.toString instead

public class Problem4 {
  
  public static int[] longestStreak(boolean[] values) {
    int count = 0;
    int highestCount = 0;
    int totalHighestCounts = 0;
    
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
    
    for (int i = 0; i < values.length; i += 1){
      if (values[i] == true) {
        count += 1;
        if (count == highestCount) {
          totalHighestCounts += 1;
          }
        }
      else {
        count = 0;
      }
    }
    //The first loop finds the longest streak of true values, the second loop finds how many streaks of that length
    //It would be more elegant to do all the work in a single for loop, but unfortunately, the nature of this method prohibits that
    //I need to pass through the entire boolean array and establish what the longest streak of true values actually is before I count how many there are and where
    //If I did both in the same loop, I would get false positives, because my loop would incorrectly assume the first streak is the longest -  
    //after all, on the first pass over the array, it has nothing to compare it to
    
    int[] truesArray = new int[totalHighestCounts + 1];
    //truesArray will always be at least size 1: even if there are no true values in the input array, it still must contain the number 0
    truesArray[0] = highestCount;
    int arrayPopulator = 1;
    //arrayPopulator is a simple way of telling the following for loop how far into truesArray it is
    
    count = 0;
    for (int i = 0; i < values.length; i += 1){
      if (values[i] == true) {
        count += 1;
        if (count == highestCount) {
          truesArray[arrayPopulator] = (i - highestCount + 1);
          arrayPopulator += 1;
        }
      }
      else {
        count = 0;
      }
    }
    //This third loop is essentially another copy of the first one, only now it finds where each maximal streak of true values begins and stores that in truesArray

    return truesArray;
    
  }
  
  //public static void main (String[] args){
    //boolean[] values = new boolean[args.length];
    //for (int i = 0; i < args.length; i += 1){
       //values[i] = Boolean.parseBoolean(args[i]);
    //}
    //System.out.println(Arrays.toString(longestStreak(values)));
  //}
  //Once again, this is a main method I've commented out because the criteria say it's not necessary
}