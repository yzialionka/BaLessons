package MoreLessons;

public class Fish {

    private int size;
    private String name;
    public boolean isFishWater;

    public Fish(int size, String name, boolean waterType) {
        this.size = size;
        this.name = name;
        isFishWater = waterType;
    }

    public double calculateSize() {
        return size * 2.54;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }


}
