package Homework2_4;

public class SecondMethod {
    public void method(float[] arr, int h) {
        long a = System.currentTimeMillis();
        float[] tr1 = new float[h];
        float[] tr2 = new float[h];
        System.arraycopy(arr, 0, tr1, 0, h);
        System.arraycopy(arr, h, tr2, 0, h);


        float[] mergedArr = new float[h * 2];
        System.arraycopy(tr1, 0, mergedArr, 0, h);
        System.arraycopy(tr2, 0, mergedArr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }

    class Tr1 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }

    }

}
