// (1) Prompt the user for a string that contains two strings separated by a comma. (1 pt)

// Examples of strings that can be accepted:
// Jill, Allen
// Jill , Allen
// Jill,Allen
// Ex:

// Enter input string: Jill, Allen

// (2) Report an error if the input string does not contain a comma. Continue to prompt until a valid string is entered. Note: If the input contains a comma, then assume that the input also contains two strings. (2 pts)

// Ex:

// Enter input string: Jill Allen
// Error: No comma in string
// Enter input string: Jill, Allen

// (3) Extract the two words from the input string and remove any spaces. Store the strings in two separate variables and output the strings. (2 pts)

// Ex:

// Enter input string: Jill, Allen
// First word: Jill
// Second word: Allen

// (4) Using a loop, extend the program to handle multiple lines of input. Continue until the user enters q to quit. (2 pts)

// Ex:

// Enter input string: Jill, Allen
// First word: Jill
// Second word: Allen

// Enter input string: Golden , Monkey
// First word: Golden
// Second word: Monkey

// Enter input string: Washington,DC
// First word: Washington
// Second word: DC


// Enter input string: q

// ask for 2 strings separated by a comma (+ to join)
// *** 
// verify that there is a comma ( while loop and if statement to check for , )
// ***
// remove the spaces (look at cc4 challenges(for clues))
// continue the loop until q is entered to quit the program => look at last monkey project to find help to implement this 

// PSEUDOCODE

// * declare a class
// * declare a main method
// * Declare Scanner scnr = new Scanner(System.in);

// * Declare variable to store the string when is split
// * firstWord = "First word: "
// * secondWord = "Second word: " 

// * Declare method parsingString() pass scanner (this will be for input)

//CHECKING FOR COMMAS AND PRINTING ERROR IF NOT FOUND WHILE LOOP
// * declare input and set to ""
// * use while loop (!input.contains(,)comma) {
// *    print ("Enter input string: ");
//      print and ask for input again     input = scnr.nextLine();
// *    use if statement to check for no comma 
// *    if (!input.contains(",")) {  
// *        print ("Error: No comma in string");
// * }

//REMOVING SPACES & SEPARATING WORD @ the (,) COMMA

// Declare an input.split(",") and set to an array
// String[] splitInput = input.split(",");  
// element accessing & assign to variable
// firstWord = array[0]
// secondWord = array[1]
// REMOVE spaces with .trim() & print with message
// firstWord = firstWord.trim();
// secondWord = secondWord.trim();

// CONTINUE TO ASK FOR INPUT IF NOT Q

// Use a while loop to check for char q to quit
// while (!input.equals("q")) {
//  Print "Enter input string: " use System.out.println();
//  set input = scnr.nextLine();
//  use if statement to check q condition
//  if (input.equals("q")) {
//      use break to stop & exit break;
//  } 
//  


import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    String firstWord = "";
    String secondWord = "";
    String input = "";

    while (!input.equals("q")) {
        System.out.println("Enter input string: ");
        input = scnr.nextLine();
        if (input.equals("q")) {
            break;
        } 

        while (!input.contains(",")) {
            System.out.println("Error: No comma in string");
            System.out.println("Enter input string: ");
            input = scnr.nextLine();
        }

        String[] splitInput = input.split(",");
        System.out.println(splitInput.length);
        firstWord = splitInput[0];
        secondWord = splitInput[1];
        firstWord = firstWord.trim();
        secondWord = secondWord.trim();
        System.out.println("First word: " + firstWord);
        System.out.println("Second word: " + secondWord);

        }
        scnr.close();
    }
}
