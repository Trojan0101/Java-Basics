public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.name = "Trojan";
//        player.health = 20;
//        player.weapon = "Knife";
//
//        int damage = 10;
//        player.lostHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.lostHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "knife");
        System.out.println("Initial health is " + player.getHitPoints());

    }
}
