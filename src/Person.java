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
        //int age=5; böyle yazılma durumuna göre this ile önlem aldık
        return this.firsName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(int age){
//        if(age <= 19 && age >= 13) {
//            return true;
//        }
//        else
//        {return false;}
        return this.age<=19 && this.age>=13;
    }


    public String[] getHobbies() {
        return this.hobbies;
    }

    public double getSalary() {
        return this.salary;
    }
}
