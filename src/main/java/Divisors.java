import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number :  ");
        int num = console.nextInt();
       //this shows the number the user inputs for the loop
        System.out.print("Divisors of " + num+" "+ "="+" " );
        //the loop runs through i, then stops after multiples of that number are entered
        //start of loop
        for (int i = 1; i < num; i++) { //loop only runs once using a for and if loop
            if (num % i != 0) {
                continue;
            }//end of loop
            System.out.print(i + " , ");
        }
    }//end of main method
}
