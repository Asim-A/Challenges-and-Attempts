public class CaesarCipher {


    public static final int SHIFT = 3;
    // æ = 230, ø = 248, å = 229


    public static void main(String[] args) {

        String encrypted = encrypt("", 15);
        System.out.println(encrypted);

    }

    static String encrypt(String text, int k) {
        if(text == null) throw new IllegalStateException();
        if(text.equals("")) throw new IllegalStateException();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < text.length(); i++){
            sb.append(shift(text.charAt(i), k));
        }

        return sb.toString();
    }

    private static char shift(char c, int shift){
        boolean isUpperCase = Character.isUpperCase(c);

        if(isUpperCase) {
            c = Character.toLowerCase(c);
        }

        if((int) c + shift > 122) {
            int diff = (int) c - 122;
            c = (char) (97 + diff - 1);
        }

        c = (char) ((int) c + shift);

        if(isUpperCase) return Character.toUpperCase(c);
        return c;
    }


}


