 public class Statistics {

     public static int alldroppedOut( int[] speedOfPlayer) {
         int sumDroppedOut = 0;


         for (int speed : speedOfPlayer) {
             if (Main.greenLight()) {
                 sumDroppedOut += 0;
             } else {
                 if (speed > 0) {
                     sumDroppedOut++;


                 }
             }
         }
         System.out.println("Выбывает всего игроков " + sumDroppedOut);
         return sumDroppedOut;
     }


     public static int[] droppedOut( int[] speedOfPlayer) {
         int sumDroppedOut = 0;
         int cnt = 0;

         for (int speed : speedOfPlayer) {
             if (Main.greenLight()) {
                 sumDroppedOut += 0;
             } else {
                 if (speed > 0) {
                     System.out.println("Выбывает игрок, чья скорость " + speed);
                     cnt++;
                 }
             }
         }
         int[] ans = new int[cnt];

             int i = 0;
             for (int speed : speedOfPlayer) {
                 if (Main.greenLight()) {
                     sumDroppedOut += 0;
                 } else {
                     if (speed > 0) {
                         ans[i] = speed;
                         i++;
                     }
                 }
             }
     return ans;
     }
     public static int[] remain( int[] speedOfPlayer) {
                  int sumDroppedOut = 0;
         int cnt = 0;

         for (int speed : speedOfPlayer) {
             if (Main.greenLight()) {
                 sumDroppedOut += 0;
                 System.out.println( "Остаются игрок, чья скорость " + speed);
             }
             else {
                 if (speed < 1) {
                     System.out.println("Остается игрок, чья скорость " + speed);
                     cnt++;
                 }
             }
         }
         int[] ans1 = new int[cnt];

         int i = 0;
         for (int speed : speedOfPlayer) {
             if (Main.greenLight()) {
                 sumDroppedOut += 0;
             } else {
                 if (speed < 1) {
                     ans1[i] = speed;
                     i++;
                 }
             }
         }
         return ans1;
     }

 }



