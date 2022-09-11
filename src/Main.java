
import java.util.Scanner;

public class Main {
    public static Squirrel Lovkatch = new Squirrel();
    public static Squirrel Strelka = new Squirrel();
    public static Cats Kyzua = new Cats("lion");
    public static Cats Georgy = new Cats("tiger");
    public static Hypo Dousya = new Hypo();
    public static ZooDoctor player = new ZooDoctor();
    public static ZooKeeper player1 = new ZooKeeper();
    public static Human[] humans = new Human[]{player, player1};


    public static Animals[] animals = new Animals[]{Lovkatch, Strelka, Kyzua, Georgy, Dousya};
    public static boolean playerStatus = true;  // будет условие для нового запуска цикла игры  - тру, значит продолжит
                                                    //текущий персонаж

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк!");
        System.out.println("Вам предстоит прогуляться по территории" +
                " и взаимодействовать с животными в роли доктора или смотрителя.");




        System.out.println("Выберите, кем будете играть:" +
                " нажмите 0 если доктором, 1 если смотрителем. " +
                "\nЕсли число будет другое то алгоритм выберет роль за вас");


        int acceptPlayer = (int)(Functions.getNumber()%2); //пользователь ввел число

        if (acceptPlayer == 0) {
            System.out.println("Ваш выбор - играть доктором");


        } else {
            System.out.println("Ваш выбор - играть смотрителем");

        }



        System.out.println("Вы заходите на территорию и видете 5 клеток с животными:\n" +
                "1я клетка - белка Ловкач, 2я клетка - белка Стрелка" +
                "\n 3я клетка - лев Кузя, 4я - тигр Жора, 5я - бегемот Дуся");
        System.out.println("Выберете животное, к которому хотите подойти, введя номер его клетки" +
                "\n Если вы введете несуществующий номер клетки, то выбор произойдет автоматически");

        int acceptAnimal = (int)(Functions.getNumber()%6);
        while (acceptAnimal == 0) {
            System.out.println("повторите ввод числа");
            acceptAnimal = (int)(Functions.getNumber()%6);
        }

        switch (acceptAnimal) {
            case 1 -> humans[acceptPlayer].goToAnimal(Lovkatch);
            case 2 -> humans[acceptPlayer].goToAnimal(Strelka);
            case 3 -> humans[acceptPlayer].goToAnimal(Kyzua);
            case 4 -> humans[acceptPlayer].goToAnimal(Georgy);
            case 5 -> humans[acceptPlayer].goToAnimal(Dousya);
        }





    } //скобка метода


} //скобка класса

