public class Wizard extends Human{
    
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human otherHuman){
        otherHuman.health += this.intelligence;
        System.out.printf("Wizard heals %s by %d!", otherHuman.toString(), this.intelligence);
    }

    public void fireBall(Human opponant){
        int fireballpower = this.intelligence * 3;
        opponant.health -= fireballpower;
        System.out.printf("Wizard blows a Giant FIREBALL!!!! It hits %s for %d leaving them with %d health.", opponant.toString(),fireballpower, opponant.health);
    }
}
