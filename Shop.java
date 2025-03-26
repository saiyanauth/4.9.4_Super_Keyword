// Shop.java
public class Shop {

    // Method to buy items
    public void visitShop(LakeObject item) {
        System.out.println("Item: " + item.getClass().getSimpleName());
        System.out.println("Cost: " + item.getCost() + " coins");
    }
}
