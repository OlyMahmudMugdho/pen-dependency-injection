package main.java;

public class BluePen implements PenInterface {
    @Override
    public void write() {
        System.out.println("Writing with blue pen");
    }
}
