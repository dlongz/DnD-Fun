public class HumanTest {
    public static void main(String[] args) {
        Human brad = new Human();
        Human steve = new Human();

        Ninja Shoto = new Ninja();
        Ninja Deli = new Ninja();
        Wizard Melvine = new Wizard();
        Samurai Jade = new Samurai();
        Samurai Jo = new Samurai();

        brad.attack(steve);
        System.out.println("\n");
        Deli.steal(Jo);
        System.out.println("\n");
        Deli.runAway();
        System.out.println("\n");
        Melvine.heal(Jo);
        System.out.println("\n");
        Shoto.steal(Melvine);
        System.out.println("\n");
        System.out.println(Samurai.howMany());
        System.out.println("\n");
        Shoto.steal(Melvine);
        System.out.println("\n");
        Melvine.fireBall(Shoto);
        System.out.println("\n");
        Jo.deathBlow(Shoto);
        System.out.println("\n");
        Melvine.fireBall(Deli);
        System.out.println("\n");
        Jo.meditate();
        System.out.println("\n");
        Jade.deathBlow(Deli);
        


        
    }

}
