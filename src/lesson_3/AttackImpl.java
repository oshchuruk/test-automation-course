package lesson_3;

public class AttackImpl implements Attack{
    private String move;
    private String attack;

    public AttackImpl(String move, String attack){
        this.attack = attack + LOL;
        this.move = move;
    }

    @Override
    public void move() {
        System.out.println(move+LOL);
    }

    @Override
    public void attack(){
        move();
        System.out.println(attack);
    }
}
