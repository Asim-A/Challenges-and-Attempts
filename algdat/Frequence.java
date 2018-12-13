import java.util.Map;
import java.util.HashMap;


public class Frequence {

    //Method developed with Hamza Amir Aftab and Nicklas Risan Dahl
    //Finds frequence of integers in an integer array. Time complexity: O(n)
	public static void frekvensFordeling(int[] a){
        HashMap<Integer, Integer> hMap = new HashMap<>();

        // Checks if the input-array has elements
        if(a.length == 0) return;

        // Throws exception if the input-array is not sorted
        if(!isSorted(a)){
            throw new IllegalStateException("input array er ikke sortert");
        }

        int temp = a[0];
        int counter = 0;

        for(int i = 0; i < a.length; i++){

            if(a[i] != temp){

                counter = 0;
                temp = a[i];
                counter++;
            }
            else counter++;

            hMap.put(temp, counter);
        }
        
        //Prints out the hashmap - found on stack overflow
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    
    //checks if the input-array is sorted
    public static boolean isSorted(int[] a){
        int arrayLen = a.length;
 
        for(int i = 0; i < arrayLen-1; i++){
            if(a[i] > a[i+1]) return false;
        }
 
        return true;
    }


}