import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int birthYear = 0;
    int currentYear = 0;
    int dogBirthYear = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your birth year: ");
    // TODO: Set birth year equal to the input value.
    birthYear = input.nextInt();

    System.out.println("Enter your dog's birth year: ");
    // TODO: Set dogBirthYear equal to the input.
    dogBirthYear = input.nextInt();

    System.out.println("Enter the current year: ");
    // TODO: Set the currentYear equal to the input.
    currentYear = input.nextInt();

    /* TODO: 
    Implement the algorithms to calculate your 
    age and your dog's age.
    */
    int Human = currentYear - birthYear;
    int Dog = (currentYear - dogBirthYear)*7;

    
    /* TODO:
    Print your calculations for each age. 
    Remember your out put should be in the form 
    Human: 73 Dog: 63
    */
    System.out.print("Human: " + Human + " Dog: " + Dog);
    
  }
}
