import BaLessons.Lesson18.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPerson {

    @Test
    public void TestPerson_AgeMultiple_Returned() {
        //Arrange
        Person person = new Person("Ivan", "Ivanov", "Some address", 30, 75, 175);

        //Act

        double answer = person.getAgeTripleByWeight();

        //Assert
        Assert.assertEquals(answer, 5250);
    }

    @Test
    public void TestPerson_getLastName_Returned() {
        //Arrange
        Person person = new Person("Ivan", "Ivanov", "Some address", 30, 75, 175);

        //Act

        String lastName = person.getLastName();

        //Assert
        Assert.assertEquals(lastName, "Ivanov");


    }
}
