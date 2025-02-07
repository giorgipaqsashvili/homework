public class Reindeer extends WorkshopMember {
    private double flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, double flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println(getName() + " is flying at " + flyingSpeed + " speed!");
    }

    public void trainForChristmas() {
        System.out.println(getName() + " is training for Christmas!");
    }

    public String checkFitnessLevel() {
        int score = (int) (flyingSpeed / age * 10);
        return "Fitness Level: " + (score > 5 ? "A" : "F");
    }
}
