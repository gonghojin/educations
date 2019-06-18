package structure.bridge;

public class Smith implements WeaponHandler {
    private Weapon weapon;

    public Smith(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void handle() {
        System.out.println("Smith");
        weapon.attack();
        weapon.repair();
    }
}
