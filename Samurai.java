public class Samurai extends Human {
    private static int howManySamurai;

    public Samurai(){
        this.health = 200;
        howManySamurai++;
    }

    public void deathBlow(Human opponant){
        opponant.health -=opponant.health;
        int halfHealth = this.health / 2;
        this.health -= halfHealth;
        System.out.printf("Samurai deals a DEATHBLOW. Killing %s but leaving Samurai with %d health. They took %d damage.",opponant.toString(),this.health,halfHealth);
    }

    public void meditate(){
        int halfHealth = this.health / 2;
        this.health += halfHealth;
        System.out.printf("Samurai meditates for hours! Increasing thier health by %d. Health is now %d.",halfHealth,this.health);
    }

    public static int howMany(){
        return howManySamurai;
    }
}

