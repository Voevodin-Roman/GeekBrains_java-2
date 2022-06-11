package Homework2_4;

public class ProcessingFloatArray {
    public static void main(String[] args) {
        final int size = 25458474;
        final int h = size / 2;
        final int p = size / Runtime.getRuntime ().availableProcessors();
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        FirstMethod firstMethod = new FirstMethod();
        firstMethod.method(arr);
        SecondMethod secondMethod = new SecondMethod();
        secondMethod.method(arr, h);





    }

}
