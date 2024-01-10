import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args){
        Person person1 =new Person("John","Doe",20);
        System.out.println("Firstname"+ person1.getFirstName());
        System.out.println("Lastname"+ person1.getLastName());
        System.out.println("Age"+ person1.getAge());


    }
}