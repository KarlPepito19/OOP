// Concrete class implementing an interface and extending an abstract class
class Mage extends Player {
    private String mageSkill;

    // Constructor
    public Mage(String name, String mageSkill) {
        super(name);
        this.mageSkill = mageSkill;
    }

    // Getter and setter methods for encapsulation
    public String getMageSkill() {
        return mageSkill;
    }

    public void setMageSkill(String mageSkill) {
        this.mageSkill = mageSkill;
    }

    // Implementation of the performRole method from the Role interface
    @Override
    public void performRole() {
        System.out.println("Casting magical spells as a Mage");
        System.out.println("Using mage skill: " + getMageSkill());
    }

    // Method using polymorphism
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Role: Mage");
        System.out.println("Mage Skill: " + getMageSkill());
    }
}
