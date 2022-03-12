public class Game {

    static boolean isGreenLight = true;

    public static boolean player (int speed) {
        if (isGreenLight) { return false;}
        else { return speed != 0;}
    }
}