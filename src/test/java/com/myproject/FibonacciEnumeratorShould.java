package test.java.com.myproject;


import main.java.com.myproject.FibonacciEnumerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FibonacciEnumeratorShould {
    @Test
    public void returnZeroAsFirstElement(){
        FibonacciEnumerator fibonacciEnumerator = new FibonacciEnumerator();
        Assertions.assertEquals(fibonacciEnumerator.elementAt(0), 0);
    }

    @Test
    public void returnOneAsSecondElement() {
        FibonacciEnumerator fibonacciEnumerator = new FibonacciEnumerator();
        Assertions.assertEquals(fibonacciEnumerator.elementAt(1), 1);
    }

    @Test
    public void returnOneAsThirdElement() {
        FibonacciEnumerator fibonacciEnumerator = new FibonacciEnumerator();
        Assertions.assertEquals(fibonacciEnumerator.elementAt(1), 1);
    }

    @ParameterizedTest
    @MethodSource("getFibonacciTestParameters")
    public void returnExpectedValueForAGivenSequenceNumber(int index, long expectedValue){
        FibonacciEnumerator fibonacciEnumerator = new FibonacciEnumerator();
        Assertions.assertEquals(expectedValue, fibonacciEnumerator.elementAt(index));
    }

    private static Stream<Arguments> getFibonacciTestParameters(){
        final Stream<Arguments> args = Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 5),
                Arguments.of(6, 8),
                Arguments.of(11, 89),
                Arguments.of(13, 233),
                Arguments.of(34, 5702887),
                Arguments.of(56, 225851433717L)
        );
        return args;
    }
}
