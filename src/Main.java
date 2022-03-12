class Main {
    public static void main(String[] args) {

        Game.isGreenLight = true;
        System.out.println( "Игрок со скоростью 2 выбывает? - " +  Game.player(2) );
        System.out.println( "Игрок со скоростью 4 выбывает? - " +  Game.player(4) );
        System.out.println( "Игрок со скоростью 0 выбывает? - " +  Game.player(0) );

        Game.isGreenLight = false;
        System.out.println( "Игрок со скоростью 1 выбывает? - " +  Game.player(1) );
        System.out.println( "Игрок со скоростью 0 выбывает? - " +  Game.player(0) );
        System.out.println( "Игрок со скоростью 9 выбывает? - " +  Game.player(9) );
    }
}






