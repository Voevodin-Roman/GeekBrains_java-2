package Homework2_2;

public class MyArrayDataException extends Exception{
    private final String text;

    public String getText() {
        return text;
    }
    public MyArrayDataException(String text) {
        this.text = text;
    }
}
