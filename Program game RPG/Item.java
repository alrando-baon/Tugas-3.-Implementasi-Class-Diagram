public class Item {
    public String itemName;
    public String type;
    public String effect;

    public void use() {
        System.out.println("Using item: " + itemName);
    }
}