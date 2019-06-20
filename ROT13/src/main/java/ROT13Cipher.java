public class ROT13Cipher {


    public static String encrypt(String input){
        StringBuilder sb = new StringBuilder();
        int len = input.length();

        ROT13 R13L = new ROT13Lowercase();
        ROT13 R13U = new ROT13Uppercase();

        for(int i = 0; i < len; i++){
            char at = input.charAt(i);
            if(isLowercase(at)) sb.append(R13L.encrypt(at));
            if(isUppercase(at)) sb.append(R13U.encrypt(at));
        }

        return sb.toString();
    }

    public static String decrypt(String input){
        return encrypt(input);
    }

    private static boolean isLowercase(char c){
        return (c >= 97 && c < 123);
    }

    private static boolean isUppercase(char c){
        return (c >= 65 && c < 92);
    }


}
