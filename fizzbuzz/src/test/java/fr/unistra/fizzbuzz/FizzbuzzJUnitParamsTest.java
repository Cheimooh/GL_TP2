package fr.unistra.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzbuzzJUnitParamsTest {

    private Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    @Parameters({"1", "2", "4", "7", "11", "13", "14"})
    public void returnsNumberForInputNotDivisibleByThreeOrFive(int number) {
        assertThat(fizzbuzz.convert(number)).isEqualTo("" + number);
    }

    @Test
    @Parameters({"15"})
    public void returnsNumberForInputDivisibleByThreeOrFive(int number) {
        assertThat(fizzbuzz.convert(number)).isEqualTo("FizzBuzz");
    }

    @Test
    @Parameters({"3", "6", "9", "12"})
    public void returnsNumberForInputDivisibleByThree(int number) {
        assertThat(fizzbuzz.convert(number)).isEqualTo("Fizz");
    }

    @Test
    @Parameters({"5", "10"})
    public void returnsNumberForInputDivisibleByFive(int number) {
        assertThat(fizzbuzz.convert(number)).isEqualTo("Buzz");
    }



}
