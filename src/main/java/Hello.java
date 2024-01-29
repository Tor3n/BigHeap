import java.io.*;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.logging.Logger;

public class Hello {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        String fullName;
        final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutput = new FileOutputStream("C:\\Code\\file1.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        Person person = new Person("Rulon", "Oboev", "Dagestan", Sex.MALE);
        outputStream.writeObject(person);

        fileOutput.close();
        outputStream.close();

        FileInputStream fiStream = new FileInputStream("C:\\Code\\file1.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Person loadedObject = (Person) objectStream.readObject();

        fiStream.close();
        objectStream.close();
    }
}