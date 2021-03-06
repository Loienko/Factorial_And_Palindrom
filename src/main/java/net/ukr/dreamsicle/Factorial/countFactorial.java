package net.ukr.dreamsicle.Factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Yura on 30.05.2017.
 */
public class countFactorial {

    public static void getFactorial(Scanner scanner) {

        System.out.println("Input tne number ->");
        // Checking for correct input of data
        if(scanner.hasNextInt()){
            BigInteger a = scanner.nextBigInteger();

            System.out.println("Factorial number " + a + " = " + factorial(a) + "\n");
        } else {
            System.out.println("Please, input the number\n");
        }
    }

    // Factorial calculations by the recursive method
    public static BigInteger factorial(BigInteger n){
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }

}
