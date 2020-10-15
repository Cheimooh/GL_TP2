package fr.unistra.fizzbuzz;

public class Fizzbuzz {

    public static String convert(int n) {
        float number = (float) n;
        if (number%3 == 0 && number%5 ==0){
            return "FizzBuzz";
        }else if (number%3 == 0){
            return "Fizz";
        }
        else if ( number%5 == 0){
            return "Buzz";
        } else {
            return "" + n;
        }
    }
}
