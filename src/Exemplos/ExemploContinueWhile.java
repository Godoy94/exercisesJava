public class ExemploContinueWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.print(i);
            i++;
        }
    }
}
