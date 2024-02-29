public class Pen {
    PenInterface pen;
    Pen(PenInterface pen) {
        this.pen = pen;
    }

    void write() {
        this.pen.write();
    }
}
