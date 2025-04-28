package array;

public class a5_LinearSearch {
    public static void main(String[] args) {
        int[] intArray={10,25,754,321,3,253,654,234};
        int searchElement=3; //you want to search this element in the array
        boolean isFound=false;  //just assume

        for(int temp:intArray){
            if(searchElement== temp){
                isFound=true;
                break;
            }
        }
        System.out.println(isFound?"element is found":"element not found");
    }
}
