package array;

public class a10_Secound_largest {
    public static void main(String[] args) {
        int[] array={10,45,34,87,33,75};
        int max=Integer.MIN_VALUE;
        int secoundMax=Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>max) {
                secoundMax = max;
                max = array[i];
            } else if (array[i]>secoundMax && array[i]<max) {
                secoundMax=array[i];
            }
        }
        System.out.println("Maximum number is -->"+max+" Second max is -->"+secoundMax);
    }
}
