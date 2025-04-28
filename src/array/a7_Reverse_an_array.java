package array;

public class a7_Reverse_an_array {
    public static void main(String[] args) {
        int[] intArray={10,50,30,70,76,44};
        int left=0;
        int right=intArray.length-1;
        while (left<right){
            int temp=intArray[left];
            intArray[left]=intArray[right];
            intArray[right]=temp;
            left++;
            right--;
        }
        System.out.println("The reverse array is-->");
        for(int reverse:intArray){
            System.out.print(reverse+" ");
        }
    }
}
