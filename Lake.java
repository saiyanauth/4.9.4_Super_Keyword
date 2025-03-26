// Lake.java
public class Lake {

    // Method to view items available at the lake (like fish)
    public void viewLake(LakeObject item) {
        System.out.println("Item: " + item.getClass().getSimpleName());
        System.out.println("Cost: " + item.getCost() + " coins");
    }
}
