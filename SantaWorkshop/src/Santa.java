import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<>();
    }

    public void deliverGifts() {
        System.out.println(getName() + " is delivering gifts!");
        for (Child child : childrenList) {
            System.out.println(getName() + " is delivering a gift to " + child.getName());
        }
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> niceChildren = new ArrayList<>();

        for (Child child : childrenList) {
            if (child.getBehaviorScore() >= 5) {
                niceChildren.add(child);
            }
        }

        return niceChildren;
    }

    @Override
    public void spreadJoy() {
        System.out.println(getName() + " is spreading Christmas joy!");
    }

    @Override
    public void singCarols() {
        System.out.println(getName() + " is singing carols!");
    }

    @Override
    public void decorateTree() {
        System.out.println(getName() + " is decorating the Christmas tree!");
    }

    public void addChild(Child child) {
        childrenList.add(child);
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Child> childrenList) {
        this.childrenList = childrenList;
    }
}
