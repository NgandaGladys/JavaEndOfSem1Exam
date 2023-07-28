
public class Main {
    public static void main(String[] args) {

        //Box instance
        Box box=new Box(20.4f);
        System.out.println("The width of the box is: "+box.getWidth()+"cm");

        //modifying(updating to new value)
        box.setWidth(5.2f);

        System.out.println("The updated width is now: "+box.getWidth()+"cm");
        System.out.println();

        //instance of the person class.
        Person person1 = new Person(20,300000);

        // Set values using setter methods
        person1.setAge(24);
        person1.setSalary(1200000.0);

        // Get values using getter methods
        int  age = person1.getAge();
        double salary = person1.getSalary();

        // Print the age and salary
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}

