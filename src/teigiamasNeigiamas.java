public class teigiamasNeigiamas {
    public static boolean arLyginis(int numb) {

        boolean val = false;
        if (numb < 0) {
            val = true;
        }
        return val;
    }

    public static boolean isEven(int numb) {
        return numb % 2 == 0;
    }
}

