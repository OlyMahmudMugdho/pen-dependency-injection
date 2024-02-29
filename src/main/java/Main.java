import main.java.BlackPen;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PenInterface blackPen = new BlackPen();
        Pen pen = new Pen(blackPen);
        pen.write();
    }
}
