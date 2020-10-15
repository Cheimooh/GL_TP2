package fr.unistra.fizzbuzz;

public interface Displayer {

    public default void display(String s) {
        System.out.println(s);
    }
}
