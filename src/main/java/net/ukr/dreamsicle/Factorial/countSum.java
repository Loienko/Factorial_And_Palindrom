package net.ukr.dreamsicle.Factorial;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Yura on 31.05.2017.
 */
public class countSum {

    public static void getCountSum(Scanner scanner){
        System.out.println("Input tne number one ->");

        if(scanner.hasNextBigDecimal()){
            BigDecimal a = scanner.nextBigDecimal();

            System.out.println("Input tne number two ->");
            BigDecimal b = scanner.nextBigDecimal();

            BigDecimal result = a.add(b);
            System.out.println(" Answer: " + result + "\n");
        } else {
            System.out.println("Please, input the numbers\n");
        }

    }

}
