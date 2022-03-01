class Main {
    public static int[] speed() {
        int[] speedOfPlayer = {5, 0, 2};
        return speedOfPlayer;
    }
    public static void main(String[] args) {
        boolean isGreenLight = false;
        int[] remain = speed();
                int sumDroppedOut = 0;

        for (int i = 0; i < speed().length; i++) {
            if (isGreenLight) { sumDroppedOut +=0;
            }
            else { if (remain[i] >0) {
                   sumDroppedOut += 1;
                 }
            }

        }
        System.out.println("Количество выбывших " + sumDroppedOut);

        for (int ii = 0; ii < speed().length; ii++) {
            if (isGreenLight) {
                sumDroppedOut +=0;
            }
            else {
                  if (remain[ii] >0 ) {
                    System.out.println("Выбывает игрок со скоростью " + remain[ii]);
                  }
            }
        }

        for (int iii = 0; iii < speed().length; iii++) {
            if (isGreenLight) {
                System.out.println("Остается игрок со скоростью " + remain[iii]);
            }
            else {
                  if (remain[iii] < 1) {
                    System.out.println("Остается игрок со скоростью " + remain[iii]);
                  }
            }
        }

    }
}



