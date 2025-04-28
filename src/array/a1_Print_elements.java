package array;

import java.lang.reflect.Array;

public class a1_Print_elements {
    public static void main(String[] args) {
        int[] int_array={34,646,64,324,55};
        for (int num:int_array){
            System.out.println(num);
        }
        System.out.println("array length-->"+int_array.length);
        System.out.println("check the element at index 3 -->"+int_array[3]);
    }
}
