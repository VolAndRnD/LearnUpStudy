class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        boolean isGreenLight = false;

        int speedOfPlayer1 = 10;
        int speedOfPlayer2 = 3;
        int speedOfPlayer3 = 8;

        int droppedOut = 0;
        if (isGreenLight) {
            System.out.println("Выбывает " + droppedOut); // если зеленый свет
        }
        else {
              if (speedOfPlayer1 != 0) {
                droppedOut += 1;
              }
              else {
                droppedOut += 0;
              } // Первый участник
              if (speedOfPlayer2 != 0) {
                droppedOut += 1;
              }
              else {
                droppedOut += 0;
              } // Второй участник
              if (speedOfPlayer3 != 0) {
                droppedOut += 1;
              }
              else {
                droppedOut += 0;
              } // Третий участник
            System.out.println("Выбывает " + droppedOut); // если красный свет
        }

    }
}
        // Допишите здесь логику так, что будет подсчитано и выведено
        // количество игроков, которые выбывают.
        // Если свет зелёный, то проходят все игроки (0 выбывают).
        // Если свет красный, то выбывает каждый, чья скорость не 0.


