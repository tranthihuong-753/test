package netbean_17_buoihocdautien;

import java.util.ArrayList;

public class b1_CollectionArray {
    public static void main(String[] args) {
        
    }
    // collection array 
    static void run_array(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add(0, "orange");
        for(String x : arr){
            System.out.println(x);
        }
    }
}
