 public class Statistics {

     public static int alldroppedOut( int[] speedOfPlayer) { // количество выбывающих
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
     return sumDroppedOut;
     }


     public static int[] droppedOut( int[] speedOfPlayer) {
     int cnt = 0;
         for (int speed : speedOfPlayer) { // счетчик размера массива
            if (Main.greenLight()) {
            } else {
                 if (speed > 0) {
                     cnt++;
                 }
            }
         }

     int[] ans = new int[cnt];
     int i = 0;
         for (int speed : speedOfPlayer) { //массив выбывающих
             if (Main.greenLight()) {
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
         int cnt = 0;
         for (int speed : speedOfPlayer) { // счетчик для массива
             if (Main.greenLight()) {
                 cnt++;
             } else {
                    if (speed < 1) {
                    cnt++;
                    }
             }
         }

         int[] ans1 = new int[cnt];
         int ii = 0;
         for (int speed : speedOfPlayer) { //массив выживших
             if (Main.greenLight()) {
                 ans1[ii]=speed;
                 ii++;
             } else {
                 if (speed < 1) {
                     ans1[ii] = speed;
                     ii++;
                 }
             }
         }
     return ans1;
     }

 }



