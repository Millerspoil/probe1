import java.util.Scanner;


public class Functions {

    public static Animals acceptAnimal(int x) {

        return switch (x) {
            case 1 -> Main.Lovkatch;
            case 2 -> Main.Strelka;
            case 3 -> Main.Kyzua;
            case 4 -> Main.Georgy;
            case 5 -> Main.Dousya;
            default -> null;
        };
    }


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

    //тут писать новую функцию

}



