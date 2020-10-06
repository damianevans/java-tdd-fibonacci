package main.java.com.myproject;

public class FibonacciEnumerator {
    //[0] [1] 2  3  4  5  6  7   8    9  10  11  12
    //0,  1,  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

    public long elementAt(int index) {

        int counter=2;
        long previous =0, next=1;
        long fibValue = 0;

        if(index < 2)
            return index;

        while( counter < index+1 ) {
            fibValue = previous+next;
            previous=next;
            next=fibValue;
            counter++;
        }
        return fibValue;

    }
}
