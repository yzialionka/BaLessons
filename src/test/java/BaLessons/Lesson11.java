package BaLessons;

public class Lesson11 {
    public static void main(String[] args) {

        Colors[] colArray = new Colors[]{Colors.GREEN, Colors.RED, Colors.BLACK, Colors.BLUE, Colors.PINK};
        printColor(colArray);

        Lipstick lipstick = new Lipstick(Colors.RED, 10);
        lipstick.setColor(Colors.GREEN);

        SchoolTypes st = getSchoolType(5);
        System.out.println(st);
    }

    public static SchoolTypes getSchoolType(int grade){
        if(grade>8){
            return SchoolTypes.HIGH;
        } if(grade>5){
            return SchoolTypes.MIDDLE;
        }
        return SchoolTypes.ELEMENTARY;
    }

    public static void printColor(Colors[] c) {
        for (Colors color : c
        ) {
            System.out.println("Our color is " + color);
        }
    }
}
