package array;

public class a11_find_Unique {
    public static void main(String[] args) {
        int[] array={10,12,12,16,10,15,16,12};
        int unique=0;

        for (int i = 0; i < array.length; i++) {
            unique=array[i];
            if (unique==array[i]){
                continue;
            }
        }
        System.out.println(unique);
    }
}
