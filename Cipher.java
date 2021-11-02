package chapter2.csc218;

/**
 * @author Daniel Graham
 * @date 2/21/2016
 */
public class Main {

    public static void main(String[] args) {

        String nametoCipher = "Daniel Graham";
        String encryptedname = "";

        for(int i=0;i<nametoCipher.length();i++){

            int currentChar = nametoCipher.charAt(i);

            if(Character.isUpperCase(currentChar)){
                currentChar = currentChar + (3 % 26);
                if(currentChar > 'Z')
                    currentChar = currentChar - 26;
            } else if(Character.isLowerCase(currentChar)){
                currentChar = currentChar + (3 % 26);
                if( currentChar > 'z')
                    currentChar = currentChar - 26;
            }
            encryptedname = encryptedname + (char) currentChar;
        }

        System.out.println(encryptedname);

    }
}
