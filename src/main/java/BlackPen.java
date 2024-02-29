package main.java;

public class BlackPen implements PenInterface {
    @Override
    public void write() {
        System.out.println("Writing with black pen");
    }
}
