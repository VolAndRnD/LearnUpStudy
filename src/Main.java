import java.util.Arrays;

class Main {

     public static void main (String[] args) {

         int[] speedOfPlayer = {5, 0, 2};
         int alldropped = Statistics.alldroppedOut(speedOfPlayer);
         int [] dropped = Statistics.droppedOut(speedOfPlayer);
         int [] allremain = Statistics.remain(speedOfPlayer);
         System.out.println (" Количество выбывших: " + alldropped);
         System.out.println( " Выбывшие: " + Arrays.toString(dropped));
         System.out.println( " Выжившие: " + Arrays.toString(allremain));

     }
     public static boolean greenLight () {
         boolean isGreenlight = false;
         return isGreenlight;
     }

}







