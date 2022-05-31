package Homework2_2;

public class Test {
    public static void main(String[] args) {
        String[][] stringArray = new String[][] {
                {"44", "22", "11", "5"},
                {"55", "66", "77", "88"},
                {"82", "24", "44", "44"},
                {"1", "4", "44", "55"}
        };
        try {
            MassArray massArray = new MassArray(stringArray);
            System.out.println("Общая сумма элементов равна " + massArray.array());
        }catch (MyArrayDataException e){
            System.out.println(e.getText());
            e.printStackTrace();
        }catch (MyArraySizeException e) {
            System.out.println(e.getText());
            e.printStackTrace();
        }


    }

}
