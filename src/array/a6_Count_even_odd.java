package array;

public class a6_Count_even_odd {
    public static void main(String[] args) {
            int[] intArray={10,23,21,45,87,42};
        int evenCount=0;
        int oddCount=0;
        for (int temp:intArray){
            if(temp%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Even number count is-->"+evenCount+"odd number count is -->"+oddCount);

    }
}
