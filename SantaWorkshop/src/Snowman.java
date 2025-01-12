import java.util.List;
import java.util.ArrayList;

public class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = false;
        this.accessories = new ArrayList<>();
    }

    public void decorate(String accessory) {
        accessories.add(accessory);
        System.out.println("Decorated Snowman with " + accessory);
    }

    public void melt() {
        if (height > 0) {
            height /= 2;
            if (height < 1) height = 0;
            System.out.println("Snowman melted. New height: " + height);
        }
    }

    public void makeMagical() {
        isMagical = true;
        System.out.println("Snowman became magical!");
    }

    public double getHeight() {
        return height;
    }

    public String getHatColor() {
        return hatColor;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public List<String> getAccessories() {
        return accessories;
    }
}
