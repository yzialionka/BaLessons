package BaLessons.Lesson16;

public class Rectangle implements Shape {

    private double wide;
    private double high;

    public Rectangle(double wide, double high) {
        this.wide = wide;
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public double getWide() {
        return wide;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public double getSquare() {
        return wide * high;
    }
}
