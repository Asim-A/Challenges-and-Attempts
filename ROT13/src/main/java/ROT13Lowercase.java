public class ROT13Lowercase implements ROT13 {

    // a=97 n=110
    @Override
    public char encrypt(char input) {
        char tempChar = input;

        if(input >= 97 && input < 110) tempChar = (char) (tempChar + 13);
        else if(input >= 110 && input < 123) tempChar = (char) (tempChar - 13);
        else throw new IllegalStateException();

        return tempChar;
    }

    @Override
    public char decipher(char input) {
        return encrypt(input);
    }
}
