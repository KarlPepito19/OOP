// Another concrete class implementing an interface and extending an abstract class
class Support extends Player {
    private String supportSkill;

    // Constructor
    public Support(String name, String supportSkill) {
        super(name);
        this.supportSkill = supportSkill;
    }

    // Getter and setter methods for encapsulation
    public String getSupportSkill() {
        return supportSkill;
    }

    public void setSupportSkill(String supportSkill) {
        this.supportSkill = supportSkill;
    }

    // Implementation of the performRole method from the Role interface
    @Override
    public void performRole() {
        System.out.println("Executing deadly attacks as an Support");
        System.out.println("Using assassin skill: " + getSupportSkill());
    }

    // Method using polymorphism
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Role: Support");
        System.out.println("Support Skill: " + getSupportSkill());
    }
}
