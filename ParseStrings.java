import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      // sets up scanner and variables
      Scanner scnr = new Scanner(System.in);
      int commaLocation = 0;
      int breakpoint = 0;
      String userInput = "";
      String firstWord = "";
      String secondWord = ""; 
      
      // while loop to take in userInput
      while (breakpoint != 1) {
         System.out.println("Enter input string: ");
         userInput = scnr.nextLine();
         
         // strips whitespace to give proper output
         userInput = userInput.replaceAll("\\s", "");
         
         // set commaLocation for use in if/else
         commaLocation = userInput.indexOf(",");
         
         // sets a condition that if userInput is equal to q loop breaks
         if (userInput.equals("q")) {
            breakpoint = 1;
         }

         // if statement that checks for a comma and throws and error if none is found
         else if (!userInput.contains(",")) {
            System.out.println("Error: No comma in string");
         }
         
         // else statement that takes, userInput, formats it and prints it out
         else{
            firstWord = userInput.substring(0, commaLocation);
            secondWord = userInput.substring(commaLocation + 1, userInput.length());

            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + secondWord);
            System.out.println();
            System.out.println();
         }   
      }
      
      return;
   }
}