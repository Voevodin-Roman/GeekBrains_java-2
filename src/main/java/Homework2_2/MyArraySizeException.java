package Homework2_2;

public class MyArraySizeException extends Exception{
    private final String text;

    public String getText() {
        return text;
    }
    public MyArraySizeException(String text) {
        this.text = text;
    }


}
