import java.util.Scanner;

public class Functions {

    public static Animals acceptAnimal(int x) {

        Animals animals = null;
        switch (x) {
            case 1:
                animals = Main.Lovkatch;
                break;
            case 2:
                animals = Main.Strelka;
                break;
            case 3:
                animals = Main.Kyzua;
                break;
            case 4:
                animals = Main.Georgy;
                break;
            case 5:
                animals = Main.Dousya;
                break;

        }
        return animals;
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



