public class Player extends Character {
    public String Name;
    public int Level;
    public int Health;
    public int Attack;

    public void Move() {
        System.out.println(Name + " is moving.");
    }

    public void AttackEnemy() {
        System.out.println(Name + " attacks the enemy!");
    }

    public void useItem() {
        System.out.println(Name + " used an item.");
    }
}