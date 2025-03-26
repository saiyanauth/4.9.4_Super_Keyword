/*
 * Activity 4.9.3
 */
// Fish.java
public class Fish extends LakeObject {

    // Override getCost method
    @Override
    public int getCost() {
        // Use super to access the superclass's getWeight() and getCost() methods
        return super.getWeight() * super.getCost(); // Returning the product of weight and cost
    }

    // Other methods and attributes of Fish (if any)
}

