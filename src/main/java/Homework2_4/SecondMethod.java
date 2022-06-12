package Homework2_4;

public class SecondMethod {
    //Метод обрабатывает входящий массив, разделяет его на 2 части и просчитывает двумя потоками. Потом склеивает части назад.
    public void method(float[] arr) throws InterruptedException {
        final int h = arr.length / 2;
        long a = System.currentTimeMillis();
        float[] tr1 = new float[h];
        float[] tr2 = new float[h];
        System.arraycopy(arr, 0, tr1, 0, h);
        System.arraycopy(arr, h, tr2, 0, h);
        TrArr trArr1 = new TrArr(tr1);
        TrArr trArr2 = new TrArr(tr2);
        Thread thread1 = new Thread(trArr1);
        Thread thread2 = new Thread(trArr2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        float[] mergedArr = new float[arr.length];
        System.arraycopy(trArr1.getTr(), 0, mergedArr, 0, h);
        System.arraycopy(trArr2.getTr(), 0, mergedArr, h, h);
        System.out.println("Время обработки массива двумя потоками: " + (System.currentTimeMillis() - a));
    }

    public class TrArr implements Runnable{
       private final float[] tr;

        public TrArr(float[] tr) {
            this.tr = tr;
        }

        public float[] getTr() {
            return tr;
        }

        @Override
        public void run() {
            for (int i = 0; i < tr.length; i++) {
                tr[i] = (float) (tr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

        }
    }

}
