package net.ukr.dreamsicle.Factorial;

import java.util.Scanner;

import static net.ukr.dreamsicle.Factorial.countFactorial.getFactorial;
import static net.ukr.dreamsicle.Factorial.countSum.getCountSum;

/**
 * Created by Yura on 31.05.2017.
 */
public class FactorialRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true){
                System.out.println("Please, click the number, what do you want to do???");
                System.out.println("1: If do you want to count the factorial:");
                System.out.println("2: If do you want to count the sum of the numbers:");
                System.out.println("3: If do you want to leave: ");
                System.out.println("Please make your choice!!! ");
                System.out.println("-> \n");

                if (scanner.hasNextInt()){
                    int s =scanner.nextInt();

                    if (s<0 | s>3){
                        System.out.println("Please make correct choice 1, 2, 3 \n");
                    }else {
                        switch (s) {
                            case 1:
                                getFactorial(scanner);
                                break;
                            case 2:
                                getCountSum(scanner);
                                break;
                            case 3:
                                System.out.println("Goodbye!!!");
                                return;
                            default:
                                return;
                        }
                    }
                } else {
                    System.out.println("Sorry, you input incorrect number or symbol");
                    return;
                }
            }
        }  finally {
            scanner.close();
        }
    }
}
