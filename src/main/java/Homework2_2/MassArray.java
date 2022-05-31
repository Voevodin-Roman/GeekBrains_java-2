package Homework2_2;

import static java.lang.Integer.valueOf;

public class MassArray {
    private final String[][] strings;

    public MassArray(String[][] strings) {
        this.strings = strings;
    }

    public int array() throws MyArraySizeException, MyArrayDataException {
        int a = 0;
        // проверка на размер массива
        if (strings.length != 4) {
            throw new MyArraySizeException("Размерность массива должна быть 4*4");
        }
        // проверка на соответствие внутреннего содержимого
        for (String[] string : strings) {
            if (string.length != 4) {
                throw new MyArraySizeException("Размерность массива должна быть 4*4");
            }
        }
        //проверка на соответствие формата каждой ячейки
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    a += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ячейка массива: \n столбец " + i + "\n Строка" + j + "\n содержит не верный формат данных - "+ strings[i][j]);
                }
            }
        }

        return a;



    }

}
