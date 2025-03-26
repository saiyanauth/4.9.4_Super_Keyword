/**
 * Activity 4.9.3
 */
// Hook.java
public class Hook extends LakeObject {
    private int strength;

    // No-argument constructor to initialize strength and cost
    public Hook() {
        super(); // Implicitly invokes the superclass constructor
        this.strength = 55; // Initialize strength to 55

        // Set the cost of the hook to 15
        this.cost = 15; // Directly setting the cost field from the superclass
    }

    // Accessor method for strength
    public int getStrength() {
        return strength;
    }

    // Method to print a message when the hook is obtained
    @Override
    public String say() {
        return "You now have a hook!";
    }

    // Method to catch the object (example interaction with the LakeObject)
    public boolean tryToCatch(LakeObject obj) {
        return obj.wasCaught(this);  // Calls the overridden wasCaught method of the specific object
    }
}
