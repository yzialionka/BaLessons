package BaLessons.existedFiles;

public class Fish {
    private int size;
    private String name;
    public boolean isFreshWater;

    public Fish(int size, String name, boolean watertype){
        this.size = size;
        this.name = name;
        isFreshWater = watertype;
    }

    public double calculateSizeinInch(){
        return size/2.54;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

}

