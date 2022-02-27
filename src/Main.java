class Main {
    public static void main(String[] args) {

        boolean isGreenLight = false;
        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        int droppedOut1 = 0;
        int droppedOut2 = 0;
        int droppedOut3 = 0;

        if (isGreenLight) {
            System.out.println("Выбывает " + Game.sumDroppedOut(droppedOut1,droppedOut2,droppedOut3)); // если зеленый свет
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
            System.out.println("Выбывает " + Game.sumDroppedOut(droppedOut1,droppedOut2,droppedOut3)); // если красный свет

        }
        Game.player1(droppedOut1);
        Game.player2(droppedOut2);
        Game.player3(droppedOut3);
    }
}
        // Допишите здесь логику так, что будет подсчитано и выведено
        // количество игроков, которые выбывают.
        // Если свет зелёный, то проходят все игроки (0 выбывают).
        // Если свет красный, то выбывает каждый, чья скорость не 0.


