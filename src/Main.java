import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Squirrel Lovkatch = new Squirrel();
    public static Squirrel Strelka = new Squirrel();
    public static Cats Kyzua = new Cats("lion");
    public static Cats Georgy = new Cats("tiger");
    public static Hypo Dousya = new Hypo();
    public static Human player;
    public static Animals[] animals = new Animals[] {Lovkatch, Strelka, Kyzua, Georgy, Dousya};

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк!");
        System.out.println("Вам предстоит прогуляться по территории" +
                " и взаимодействовать с животными в роли доктора или смотрителя.");
        System.out.println("Для начала выберите, кем будете играть:" +
                " нажмите 1 если доктором, 0 если смотрителем. " +
                "\nЕсли число будет другое то алгоритм выберет роль за вас");

        long sc2;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            try {
                String sc = scanner.nextLine().trim().replaceAll("\s", "");
                sc2 = Long.parseLong(sc);
                break;
            } catch (NumberFormatException e) {
                System.out.println("повторите ввод числа");
            }
        }

        if (sc2 % 2 == 0) {
            System.out.println("Ваш выбор - играть смотрителем");
            player = new ZooKeeper();

        } else {
            System.out.println("Ваш выбор - играть доктором");
            player = new ZooDoctor();
        }


        System.out.println("Вы заходите на территорию и видете 5 клеток с животными:" +
                "1я клетка - белка Ловкач, 2я клетка - белка Стрелка" +
                "\n 3я клетка - лев Кузя, 4я - тигр Жора, 5я - бегемот Дуся");
        System.out.println("Выберете животное, к которому хотите подойти, введя номер его клетки" +
                "\n Если вы введете несуществующий номер клетки, то выбор произойдет автоматически");

        int sc3;
        while (true) {
            try {
                sc3 = scanner.nextInt();
                sc3 = sc3 % 6;
                while (sc3 == 0) {
                    System.out.println("повторите ввод числа");
                    sc3 = scanner.nextInt();
                    sc3 = sc3 % 6;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("повторите ввод числа");
            }
        }
        player.goToAnimal(Functions.acceptAnimal(sc3));



    }
}
