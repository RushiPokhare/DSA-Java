package array;

public class a3_max_number {
    public static void main(String[] args) {
        int[] intArray={10,56,23,54,76,23,123,11};
        int maxNumber=Integer.MIN_VALUE;

        for (int temp:intArray){
            if (temp>maxNumber){
                maxNumber=temp;
            }
        }
        System.out.println("largest number is -->"+maxNumber);
    }
}
