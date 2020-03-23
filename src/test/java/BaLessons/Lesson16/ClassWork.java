package BaLessons.Lesson16;

public class ClassWork {
    public static void main(String[] args) {


        Person boris = new Person("Boris", "Jhonson");
        Person john = new Person("Jhon", "Dole");
        Person sam = new Person("Sam", "Smith");


        Person teach = new Teacher("My", "Teacher");
        // teach.printName();


        Shape sq = new Square(4);
        Rectangle sq1 = new Square(5);
        Shape cr = new Circle(8);
        Rectangle rt = new Rectangle(4, 7);
        Circle cr1 = new Circle(10);

        Shape[] shapes = new Shape[]{sq, sq1, cr, rt, cr1};

        for (Shape sh : shapes) {
            System.out.println(sh.getSquare());
        }


        //sam.printName();

        //System.out.println(Person.getNumber());


    }
}
