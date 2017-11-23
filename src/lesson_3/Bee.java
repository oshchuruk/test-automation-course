package lesson_3;

public class Bee extends Insect {
    public Attack attack;

    public Bee(int size, String color, Attack attack){
        super(size, color);
        this.attack = attack;
    }

    public void move(){
        attack.move();
    }

    public void attack(){
        attack.attack();
    }

    public static void main(String [] args){
        Bee bee = new Bee(13, "yellow", new AttackImpl("fly", "sting"));
        bee.attack();
    }
}
