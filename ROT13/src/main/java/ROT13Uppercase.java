public class ROT13Uppercase implements ROT13{

    // A=65 N=78

    @Override
    public char encrypt(char input) {
        char tempChar = input;

        if(input >= 65 && input < 78) tempChar = (char) (tempChar + 13);
        else if(input >= 78 && input < 91) tempChar = (char) (tempChar - 13);
        else throw new IllegalStateException();

        return tempChar;
    }

    @Override
    public char decipher(char input) {
        return encrypt(input);
    }

    public String encryptUppercase(String input){
        StringBuilder sb = new StringBuilder();
        input = input.toUpperCase();
        final int len = input.length();

        for(int i = 0; i < len; i++){
            char tempChar = input.charAt(i);
            if(tempChar < 65 || tempChar > 90) throw new IllegalStateException();
            if(tempChar >= 65 && tempChar < 78) sb.append((char) (tempChar + 13));
            if(tempChar >= 78 && tempChar < 91) sb.append((char)(tempChar - 13));
        }

        return sb.toString();
    }

}
