import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner word = new Scanner(System.in);  //Scanner object created
    System.out.println("Enter a word:");
    String wordInput = word.nextLine(); //User input recorded to this variable
    System.out.println(wordInput.length()); //Displays the length of the word
    
    //Your code will return the length of the entered String
  }
}