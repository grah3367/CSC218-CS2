/**
 * @author Daniel Graham
 * @date 2/15/2015
 * Week 2 Problem 10
 */

package chapter2.csc218;

public class chap2Problem10 {

    public static void main(String[] args) {

        int maxNum=100;  // the maximum number to check for primes
        System.out.println("Printing primes up to " + maxNum);

        for(int i=2;i<=maxNum;i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
        int a=1; int b=2;
        int c=0;

//postfix
        c = a + b++; // c will equal 3. B will be three AFTER a+b is evaluated.
        System.out.println(c); // c is 3 because the assignment did not include the increment.
        System.out.println(b); // b is 3 now because it’s after the assignment to c.
        a=1; b=2; c=0; // reset the values
//prefix
        c = a + ++b; // c will equal 5. B will be three BEFORE a+b is evaluated.
        System.out.println(c); // c is 4 because it includes the increment.
        System.out.println(b); // b is 4 because

    }

    /**
     * check each number up to half of the number.
     * the increment clause is advanced by 2 to
     * @param num the number to check if is a prime.
     * @return boolean if prime or not
     */
    public static boolean isPrimeNumber(int num) {

        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num%i == 0)
                return false; // the number is divisible
        }
        return true;
    }
}
