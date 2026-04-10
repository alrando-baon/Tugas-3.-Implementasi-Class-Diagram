import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public int capacity;
    private List<Item> items = new ArrayList<>();

    public void addItem() {
        if (items.size() < capacity) {
            System.out.println("Item added to inventory.");
        }
    }

    public void Removeitem() {
        System.out.println("Item removed from inventory.");
    }
}