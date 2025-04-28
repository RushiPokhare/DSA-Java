package array;

public class a4_min_number {
    public static void main(String[] args) {
        int[] intArray={40,32,123,654,1,541,0};
        int minNumber=Integer.MAX_VALUE;

        for (int temp:intArray){
            if (temp<minNumber){
                minNumber=temp;
            }
        }
        System.out.println("Minimum Number is -->"+minNumber);
    }
}
