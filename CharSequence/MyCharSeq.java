package assignment.cs2;

/**
 * Created by Dan.
 */
import java.util.ArrayList;

class MyCharSeq implements CharSequence {
    private ArrayList<Character> charData = null;

    public MyCharSeq() {
        this.setCharData(new String());
    }

    @Override
    public char charAt(int index) {
        char c = (char) this.getCharData().get(index);
        return c;
    }

    @Override
    public int length() {
        return getCharData().size();
    }


    @Override
    public String toString() {
        String str = this.getCharData().toString();
        return str;
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > getCharData().size()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }

        MyCharSeq ch = new MyCharSeq();
        ch.setCharData(ch.getCharData().subList(start, end).toString());
        return ch;
    }

    public void setCharData(String charData) {
        ArrayList<Character> ar = new ArrayList<Character>();
        char[] cArray = charData.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            ar.add(cArray[i]);
        }
        this.charData = ar;
    }

    public ArrayList<Character> getCharData() {
        return charData;
    }


}