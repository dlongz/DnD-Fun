public class Human {
    private int strength, stealth, intelligence, health;

    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public Human(int strength, int stealth, int intelligence, int health){
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public void attack(Human){
        Human.health = Human.health - this.strength;
    }
}
