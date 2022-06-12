package Homework2_4;

public class ProcessingFloatArray {
    public static void main(String[] args) {
        final int size = 254584742;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        FirstMethod firstMethod = new FirstMethod();
        firstMethod.method(arr);
        SecondMethod secondMethod = new SecondMethod();
        secondMethod.method(arr);
        AllCoresMethod allCoresMethod = new AllCoresMethod();
        allCoresMethod.method(arr);





    }

}
