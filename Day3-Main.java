//-------Chapter 5----------

class Engine {
    private String type;
    public Engine(String type) { this.type = type; }
    public String getType() { return type; }
}

class Car {
    // Composition: Car owns the Engine exclusively
    private Engine engine = new Engine("V8");

    public String getEngineInfo() {
        return engine.getType();
    }
}

class Player {
    String name;
    public Player(String name) { this.name = name; }
}

class Team {
    private java.util.List<Player> players;

    public Team(java.util.List<Player> players) {
        this.players = players;
    }
}

//------Chapter 6---------


class Animal {
    protected String name; // PROTECTED access

    public Animal() {
        System.out.println("Animal default constructor");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal parameterized constructor");
    }

    public void speak() {  // Will be overridden
        System.out.println("Animal sound");
    }

    // Overloading example
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void eat(String food) {  // Overload
        System.out.println(name + " is eating " + food + ".");
    }
}
class Dog extends Animal {
    private final String breed;
    public Dog(String name, String breed) {
        super(name);    // super keyword
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }
}
public class Main {
    public static void main(String[] args) {

        // Composition 
        Car car = new Car();
        System.out.println("Car engine type: " + car.getEngineInfo());

        // Aggregation 
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");
        Team team = new Team(java.util.Arrays.asList(p1, p2));
        //Inheritance
        Dog dog = new Dog("Max", "Labrador");
        dog.speak();
        dog.eat();
        dog.eat("chicken");
    }
}
