import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("aleko", "xorxe", 120, 8, "Toy Maker");
        elf1.makeToy();
        elf1.wrapGifts();

        Reindeer reindeer1 = new Reindeer("Rudolph", "Speedy", 5, 10.5, "Red");
        reindeer1.fly();
        System.out.println(reindeer1.checkFitnessLevel());

        Child child1 = new Child("petre", 6);
        child1.addWish("Toy Car");
        child1.addWish("Doll");

        Santa santa = new Santa("iupitera", "santovichi", 1000);
        santa.addChild(child1);
        List<Child> niceChildren = santa.checkNaughtyOrNiceList();
        System.out.println("Nice children: " + niceChildren.size());
        santa.deliverGifts();

        Snowman snowman = new Snowman(6, "Red");
        snowman.decorate("Scarf");
        snowman.melt();
    }
}

