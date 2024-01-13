class Tank extends Player {
    private String tankSkill;

    public Tank(String name, String tankSkill) {
        super(name);
        this.tankSkill = tankSkill;
    }

    public String getTankSkill() {
        return tankSkill;
    }

    public void setTankSkill(String tankSkill) {
        this.tankSkill = tankSkill;
    }

    @Override
    public void performRole() {
        System.out.println("Absorbing damage as a Tank");
        System.out.println("Using tank skill: " + getTankSkill());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Role: Tank");
        System.out.println("Tank Skill: " + getTankSkill());
    }
}

