import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        double firstNumber = Math.random() * 10;
        double secondNumber = Math.random() * 10;

        System.out.println("What random number will be rendered?");
        DecimalFormat formNum = new DecimalFormat("#.00");
        System.out.println(formNum.format(firstNumber + secondNumber));

        System.out.println("Now what of the two parameters was the greatest?");
        System.out.print(Math.max(firstNumber, secondNumber) + " ... Huh, who\'da thunk it?\n");

        while(true){
            System.out.println("Now enter a number, see if you can figure out the formula that manipulates it:");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                CalcStats funCalc = new CalcStats(scan.nextInt());
                System.out.println(funCalc.ttrpgCalc());
            } else {
                char quit = scan.next().charAt(0);
                if (quit == 'Q' || quit == 'q') {
                    scan.close();
                    break;
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            }
            System.out.println("If you want to exit, enter \'Q\' in the Scanner prompt.");
        }
    }
}