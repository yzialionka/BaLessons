package BaLessons.Lesson16;

public class Square extends Rectangle {
    public Square(double wide) {
        super(wide, wide);
    }

    public double getSquare() {
        //return getWide()*getWide();
        return super.getSquare();
    }
}
