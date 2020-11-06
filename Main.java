import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println(
      "Mr. Jordan: Hello boys and girls, my name is Mr. Jordan and I will be your awesome teacher for this to happen I would like to know all your names!");
      // This is just Mr. Jordan introducing himself to the class and asking for their nammes 
    int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    // this is the seat numbers
    String[] names = new String[15];
    // this represents 15 students
    Scanner scan = new Scanner(System.in);
    // This scanner is to get students names
    for (int i = 0; i < 15; i++){
      System.out.println("What is your name?");
      names[1] = scan.next();
    }
    System.out.println("Mr. Jordan: Nice to meet you boys and girls, now we shall give everyone assigned seats");

    // while (numbers[] < 15; names[] < 15) {
       // System.out.println(names[] + "You will sit in" + numbers     []);*/
  }
}