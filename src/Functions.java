import java.util.Scanner;


public class Functions  {
    public static long getNumber() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        long sc2;
        while (true) {
            try {
                String sc = scanner.nextLine().trim().replaceAll("\s", "");
                sc2 = Long.parseLong(sc);
                break;
            } catch (NumberFormatException e) {
                System.out.println("повторите ввод числа");
            }
        }
        return sc2;
    }

}



