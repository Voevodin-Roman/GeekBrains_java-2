package Homework2_4;

public class SecondMethod {
    float[] tr1;
    float[] tr2;

    public void method(float[] arr, int h) {
        long a = System.currentTimeMillis();
        tr1 = new float[h];
        tr2 = new float[h];
        System.arraycopy(arr, 0, tr1, 0, h);
        System.arraycopy(arr, h, tr2, 0, h);
        Thread thread1 = new Thread(new Tr1());
        thread1.start();
        Thread thread2 = new Thread(new Tr2());
        thread2.start();


        float[] mergedArr = new float[h * 2];
        System.arraycopy(tr1, 0, mergedArr, 0, h);
        System.arraycopy(tr2, 0, mergedArr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }

    class Tr1 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < tr1.length; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

    }
    class Tr2 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < tr1.length; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

    }


}
