import java.util.ArrayList;

//Question1(iv)
public class Animal {
//initialised the ArrayList
    private String name;
private static ArrayList<Animal> animals=new ArrayList<Animal>();

    public Animal(String name) {
        this.name = name;
    }


    public  static  void addAnimal(Animal animal){

        animals.add(animal);
    }
    //getter to get the names
    public String getName() {
        return name;
    }


    public static ArrayList<Animal> getAnimals() {

        return animals;
    }

    public static void main(String[] args) {
        //instances of the animal class.

        Animal animal1=new Animal("Bull");
        Animal animal2=new Animal("Dog");
        Animal animal3=new Animal("Cat");
        Animal animal4=new Animal("Rabbit");

        Animal.addAnimal(animal1);
        Animal.addAnimal(animal2);
        Animal.addAnimal(animal3);
        Animal.addAnimal(animal4);
        //display all Animals
        ArrayList<Animal>animals=Animal.getAnimals();
        for (Animal animal:animals)
        {
            System.out.println("AnimalName: "+animal1.getName()+animal2.getName()+animal3.getName()+animal4.getName());
        }
    }



}
