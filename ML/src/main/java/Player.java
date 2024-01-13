// Abstract class with inheritance
abstract class Player implements Role {
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
    }

    // Getter and setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method using polymorphism
    public void printInfo() {
        System.out.println("Hero: " + getName());
    }
}

