import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInputs = 10, input = 0, sum = 0, end = 0;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < numInputs; i++){
            input = sc.nextInt();
            if(input == end){
                break;
            }else{}
            sum += input;
        }
        System.out.println("The sum of numbers was " + sum);
    }
}
