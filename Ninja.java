public class Ninja extends Human {
    
    public Ninja(){
        this.stealth = 10;
    };

    public void steal(Human opponant){
        opponant.health -= this.stealth;
        System.out.printf("Ninja steals health from %s by %d\nLeaving %s with %d heath left.", opponant, this.stealth,opponant.toString(), opponant.health);
    }

    public void runAway(){
        this.health -= 10;
        System.out.printf("Ninja runs away! Losses %d health.", 10); 
    }

}
