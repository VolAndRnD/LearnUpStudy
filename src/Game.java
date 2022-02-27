public class Game {
    public static void player1 (int a) {
        System.out.println("Игрок 1 прошел? - " + (a == 0));
    }
    public static void player2 (int b) {
        System.out.println("Игрок 2 прошел? - " + (b == 0));
    }
    public static void player3 (int c) {
        System.out.println("Игрок 3 прошел? - " + (c == 0));
    }
    public static int sumDroppedOut (int droppedOut1, int droppedOut2, int droppedOut3) {
        int sum = droppedOut1 + droppedOut2 + droppedOut3;
        return sum;
    }


}





