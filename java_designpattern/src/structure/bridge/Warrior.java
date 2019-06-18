package structure.bridge;

public class Warrior implements WeaponHandler {
    private Weapon weapon;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void handle() {
        System.out.println("Warrior ");
        weapon.attack();
        weapon.repair();
    }
}
