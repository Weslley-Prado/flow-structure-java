package counter.flow;

import java.util.Scanner;

import counter.flow.exceptions.*;

/**
 * This class represents a counter that prints out a sequence of numbers based on two input parameters.
 * If the first parameter is greater than the second parameter, a custom exception is thrown.
 */
public class Counter {
    /**
     * The main method that receives two input parameters and calls the count method to print out the sequence of numbers.
     * @param args The array of input parameters passed through the command line.
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter:");
        int parameterOne = terminal.nextInt();
        System.out.println("Enter the second parameter:");
        int parameterTwo = terminal.nextInt();

        try {
            //calling the count method containing the counting logic
            count(parameterOne, parameterTwo);

        } catch (InvalidParametersException e) {
            //print the message: "The second parameter must be greater than the first."
            System.out.println(e.getMessage());
        }

        terminal.close();
    }

    /**
     * This method receives two input parameters and prints out a sequence of numbers based on them.
     * If the first parameter is greater than the second parameter, a custom exception is thrown.
     * @param parameterOne The first input parameter.
     * @param parameterTwo The second input parameter.
     * @throws InvalidParametersException Thrown if the first input parameter is greater than the second.
     */
    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        //validate if parameterOne is greater than parameterTwo and throw the exception
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("The second parameter must be greater than the first.");
        }

        int count = parameterTwo - parameterOne;

        //iterate through the count and print out each number in the sequence
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}


