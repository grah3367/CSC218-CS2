package assignment.cs2;
/*
 * @author: Daniel Graham
 * @assignment: 7
 */
public class Main {

    public static void main(String[] args) {

        // here the methods are being called and used.
        MyCharSeq first = new MyCharSeq();
        first.setCharData("Eric Lake");
        char firstChar = first.charAt(2);
        int firstLength = first.length();
        String firstStr = first.toString();

        MyCharSeq second = (MyCharSeq) first.subSequence(0, 4);

    }
}
