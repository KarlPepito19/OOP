// Another concrete class implementing an interface and extending an abstract class
class Assassin extends Player {
    private String assassinSkill;

    // Constructor
    public Assassin(String name, String assassinSkill) {
        super(name);
        this.assassinSkill = assassinSkill;
    }

    // Getter and setter methods for encapsulation
    public String getAssassinSkill() {
        return assassinSkill;
    }

    public void setAssassinSkill(String assassinSkill) {
        this.assassinSkill = assassinSkill;
    }

    // Implementation of the performRole method from the Role interface
    @Override
    public void performRole() {
        System.out.println("Executing deadly attacks as an Assassin");
        System.out.println("Using assassin skill: " + getAssassinSkill());
    }

    // Method using polymorphism
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Role: Assassin");
        System.out.println("Assassin Skill: " + getAssassinSkill());
    }
}
