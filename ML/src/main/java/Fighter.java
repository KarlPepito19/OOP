class Fighter extends Player {
    private String fighterSkill;

    public Fighter(String name, String fighterSkill) {
        super(name);
        this.fighterSkill = fighterSkill;
    }

    public String getFighterSkill() {
        return fighterSkill;
    }

    public void setFighterSkill(String fighterSkill) {
        this.fighterSkill = fighterSkill;
    }

    @Override
    public void performRole() {
        System.out.println("Engaging in close combat as a Fighter");
        System.out.println("Using fighter skill: " + getFighterSkill());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Role: Fighter");
        System.out.println("Fighter Skill: " + getFighterSkill());
    }
}

