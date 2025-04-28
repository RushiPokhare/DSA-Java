package array;

public class a2_Sum_of_all_elements {
    public static void main(String[] args) {
        int sum=0;
        int [] intArray={2,3,4,5,77};
        for (int index = 0; index < intArray.length; index++) {
            sum=sum+intArray[index];
        }
        System.out.println(sum);
    }
}
