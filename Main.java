package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int firstNumber = 0; int secondNumber = 1;

        System.out.print(firstNumber + " , " + secondNumber );
    for (int i = 0; i < 5; i++) {
        int sum = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = sum;

        System.out.print (" , " + sum );
    }


    }
}
