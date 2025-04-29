package array;
//VLN-      33.:18
public class a3_max_number {
    public static void main(String[] args) {
        int[] Array={10,56,23,54,76,23,123,11};
        int maxNumber=Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]>maxNumber){
                maxNumber=Array[i];
            }
        }
        System.out.println("largest number is -->"+maxNumber);
    }
}


// for (int temp:Array){
//        if (temp>maxNumber){
//maxNumber=temp;
//            }
//                    }