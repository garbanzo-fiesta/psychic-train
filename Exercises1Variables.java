import java.util.Random;

public class Exercises1Variables {

    public static void main(String[] args) {
        // exercise 1.
        // create a variable with each primitive type (you can look up what the
        // primitive types in Java are, e.g. String isn't a primitive type)

        // execise 2.
        // try adding the value of different pairs of numeric types and see what the
        // result will be
        // Can you assign smaller data types (e.g. int) to larger data types (e.g.
        // long)? What about the reverse?

        // exercise 3.
        // try dividing the numeric variables you created in exercise 1. by 2 and see
        // what the results are
        // Is there anything surprising?

        // exercise 4.
        int randomInt = new Random().nextInt();
        System.out.println("randomInt = " + randomInt);
        // On the following line try to reasign the value of the random int to be its
        // current value + 1
        // uncomment the next line and implement your solution
        // int randomInt =
        System.out.println("randomInt = " + randomInt);

        // exercise 5.
        // create 2 String variables and combine their values into a third variable

        // exercise 6.
        // use the thrid string variable above to print
        // 'The value of the variable is "..."'
        // (note that the variable's value should be enclosed in double quotes)

    }

}