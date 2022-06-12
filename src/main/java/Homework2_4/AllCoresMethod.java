package Homework2_4;

public class AllCoresMethod {
    //Метод обрабатывает входящий массив, разделяет его на 2 части и просчитывает двумя потоками. Потом склеивает части назад.
    public void method(float[] arr) {
        final int cores = Runtime.getRuntime ().availableProcessors();
        final int c = arr.length / cores;
        final int residue = arr.length% Runtime.getRuntime ().availableProcessors();
        long a = System.currentTimeMillis();
        int thread;
        float[][] trArray;
        if(residue != 0){
            int startАrray = 0;
            thread = cores + 1;
            trArray = new float[thread][];
            trArray[0] = new float[residue];
            System.arraycopy(arr, 0, trArray[0], 0, residue);
            startАrray = residue;
            for (int i = 1; i < thread; i++) {
                trArray[i] = new float[c];
                System.arraycopy(arr, startАrray, trArray[i], 0, c);
                startАrray = startАrray + c;
            }
        }else {
            int startАrray = 0;
            thread = cores;
            trArray = new float[thread][];
            for (int i = 0; i <thread; i++) {
                trArray[i] = new float[c];
                System.arraycopy(arr, startАrray, trArray[i], 0, c);
                startАrray = startАrray + c;
            }
        }

        TrArr[] trArr = new TrArr[thread];
        Thread[] threads = new Thread[thread];
        for (int i = 0; i < thread; i++) {
            trArr[i] = new TrArr(trArray[i]);
            threads[i] = new Thread(trArr[i]);
            threads[i].start();
        }

        float[] mergedArr = new float[arr.length];
        int endАrray = 0;
        for (int i = 0; i < thread; i++) {
            System.arraycopy(trArr[i].getTr(), 0, mergedArr, endАrray, trArr[i].getTr().length);
            endАrray = endАrray + trArr[i].getTr().length;
        }
        System.out.println("Время обработки массива всеми доступными ядрами: " + (System.currentTimeMillis() - a));
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
