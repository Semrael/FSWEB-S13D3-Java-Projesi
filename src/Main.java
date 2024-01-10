import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("Lastname: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

        Person person2 = new Person("Semra", "Elçelik", 25, 12222, true, new String[]{"piano", "chess"});
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("Lastname: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println(Arrays.toString(person2.getHobbies()));
        System.out.println("Salary: "+ person2.getSalary());

        Person person3 =new Person("Semra","Elçelik",25);
        System.out.println("Firstname: "+ person2.getFirstName());
        System.out.println("Lastname: "+ person2.getLastName());
        System.out.println("Age: "+ person2.getAge());
        //System.out.println("Salary: "+ person2.getSalary());
        System.out.println("*****************************************");

        Wall wall= new Wall(5,4);
        System.out.println("area="+wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width="+wall.getWidth());
        System.out.println("height="+wall.getHeight());
        System.out.println("area="+wall.getArea());
        //static metoda ulaşmak için oluşturduğumuz wall instense'ı le çağıramayız
        //wall.getStaticTest(); bu şekilde tanımlayamayız
        Wall.getStaticTest();






    }
}