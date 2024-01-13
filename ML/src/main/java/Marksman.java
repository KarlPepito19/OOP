class Marksman extends Player {
    private String marksmanSkill;

    public Marksman(String name, String marksmanSkill) {
        super(name);
        this.marksmanSkill = marksmanSkill;
    }

    public String getMarksmanSkill() {
        return marksmanSkill;
    }

    public void setMarksmanSkill(String marksmanSkill) {
        this.marksmanSkill = marksmanSkill;
    }

    @Override
    public void performRole() {
        System.out.println("Firing precise shots as a Marksman");
        System.out.println("Using marksman skill: " + getMarksmanSkill());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Role: Marksman");
        System.out.println("Marksman Skill: " + getMarksmanSkill());
    }
}
