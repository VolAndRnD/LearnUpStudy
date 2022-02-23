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
    public static void main(String[] args) {

        boolean isGreenLight = false;
        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        int droppedOut1 = 0;
        int droppedOut2 = 0;
        int droppedOut3 = 0;

        if (isGreenLight) {
            System.out.println("Выбывает " + sumDroppedOut(droppedOut1,droppedOut2,droppedOut3)); // если зеленый свет
        } else {
            if (speedOfPlayer1 != 0) {
                droppedOut1 ++;
            }// Первый участник
            if (speedOfPlayer2 != 0) {
                droppedOut2 ++;
            }// Второй участник
            if (speedOfPlayer3 != 0) {
                droppedOut3 ++;
            }// Третий участник
            System.out.println("Выбывает " + sumDroppedOut(droppedOut1,droppedOut2,droppedOut3)); // если красный свет

        }
        player1(droppedOut1);
        player2(droppedOut2);
        player3(droppedOut3);
    }

}





