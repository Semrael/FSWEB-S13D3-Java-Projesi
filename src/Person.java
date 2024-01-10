public class Person {
    String firsName;
    String lastName;
    int age;
    double salary;
    boolean isWomen;
    String[] hobbies;

    //constructor overloading and chaining
    public Person(String firsName, String lastName,int age,double salary,boolean isWomen, String[] hobbies) {
        this(firsName,lastName,age);
        if(salary<11500){
            this.salary=11500;
        }
        else {
            this.salary=salary;
        }

        this.isWomen=isWomen;
        this.hobbies=hobbies;
    }

    public Person(String firsName,String lastName,int age){
        this.firsName=firsName;
        this.lastName=lastName;
        this.age=age;
    }

    public String getFirstName(){
        return firsName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(int age){
//        if(age <= 19 && age >= 13) {
//            return true;
//        }
//        else
//        {return false;}
        return age<=19 && age>=13;
    }


}
