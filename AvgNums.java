/*
*
* @author Daniel Graham
* @date 2/25/2016
* Week 4 Assignment 4
* Chapter 5 Question 3
*
* This programs gets the average of 10 numbers
 */

package chapter5.csc218;

public class Main {

    public static void main(String[] args) {
	 double[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getAvg(numbers));
    }
    static double getAvg(double[] array) {
        double avg=0;
        for(int i=0;i<array.length;i++){
            avg += array[i];
        }
        return avg/array.length;
    }

}
