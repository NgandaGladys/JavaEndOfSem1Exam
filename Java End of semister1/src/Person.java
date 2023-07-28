//Question4
//(i)A class is a blue print for creating objects while An object is an instance of a class.

//Created class Person
public class Person {
    //created private attributes of the class to be accessed only in that class.
    private int  age;
    private double salary;

    //constructor to initialise attributes of the class
    public Person(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

//getters and setters to access the initial values and update them respectively
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


