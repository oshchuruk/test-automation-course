package lesson_3;

public class Wasp extends Bee {

    private int count;

    public Wasp(int size, String color, Attack attack, int count) {
        super(size, color, attack);
        this.count = count;
    }

    public Wasp(int count){
        super(12, "black", new AttackImpl("fly", "bite"));
        this.count = count;
    }

    @Override
    public void attack() {
        while (count != 0) {
            attack.attack();
            count--;
        }
    }

    public static void main(String[] args) {
        Wasp wasp = new Wasp(12,"green", new AttackImpl("fly", "sting"), 2);
        wasp.attack();
        System.out.println("\n");
        Wasp wasp2 = new Wasp(10);
        wasp2.attack();
        System.out.println(wasp2.hashCode());
    }
}
