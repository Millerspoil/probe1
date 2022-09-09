
import java.util.Scanner;

public class Main {
    public static Squirrel Lovkatch = new Squirrel();
    public static Squirrel Strelka = new Squirrel();
    public static Cats Kyzua = new Cats("lion");
    public static Cats Georgy = new Cats("tiger");
    public static Hypo Dousya = new Hypo();
    public static Human player;
    public static Animals[] animals = new Animals[]{Lovkatch, Strelka, Kyzua, Georgy, Dousya};
    public static boolean playerStatus = true;  // будет условие для нового запуска цикла игры  - тру, значит продолжит
                                                    //текущий персонаж

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк!");
        System.out.println("Вам предстоит прогуляться по территории" +
                " и взаимодействовать с животными в роли доктора или смотрителя.");




        System.out.println("Выберите, кем будете играть:" +
                " нажмите 1 если доктором, 0 если смотрителем. " +
                "\nЕсли число будет другое то алгоритм выберет роль за вас");


        long acceptPlayer = Functions.getNumber();

        if (acceptPlayer % 2 == 0) {
            System.out.println("Ваш выбор - играть смотрителем");
            player = new ZooKeeper();

        } else {
            System.out.println("Ваш выбор - играть доктором");
            player = new ZooDoctor();
        }


        System.out.println("Вы заходите на территорию и видете 5 клеток с животными:\n" +
                "1я клетка - белка Ловкач, 2я клетка - белка Стрелка" +
                "\n 3я клетка - лев Кузя, 4я - тигр Жора, 5я - бегемот Дуся");
        System.out.println("Выберете животное, к которому хотите подойти, введя номер его клетки" +
                "\n Если вы введете несуществующий номер клетки, то выбор произойдет автоматически");

        acceptPlayer = Functions.getNumber();
        acceptPlayer = acceptPlayer % 6;
        int acceptAnimal = (int)acceptPlayer;
        while (acceptPlayer == 0) {
            System.out.println("повторите ввод числа");
            acceptPlayer = Functions.getNumber();
            acceptAnimal = (int)(acceptPlayer % 6);
        }
          playerStatus = player.goToAnimal(Georgy);




    } //скобка метода


} //скобка класса

