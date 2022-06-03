package Homework2_2;
// 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
// 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
// и вывести результат расчета.


public class Test {
    public static void main(String[] args) {
        String[][] stringArray = new String[][] {
                {"44", "22", "11", "5"},
                {"55", "66", "33", "44"},
                {"82", "24", "44", "44"},
                {"1", "4", "44", "55"}
        };
        try {
            System.out.println("Общая сумма элементов равна " + new ProcessingMassArray(stringArray).arrayCheck());
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }

}
