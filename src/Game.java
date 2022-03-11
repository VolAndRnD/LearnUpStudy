public class Game {

    static boolean isGreenLight = false;


    public static boolean player () {
        boolean player = true;
        if (player == isGreenLight) { player = false;}
        else { player = (Main.speed()!= 0);}
            return player;
    }
}





