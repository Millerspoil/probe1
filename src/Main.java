public class Main {
    public static Squirrel Lovkatch = new Squirrel("Ловкач");
    public static Squirrel Strelka = new Squirrel("Стрелка");
    public static Cats Kyzua = new Cats("лев", "Кузя");
    public static Cats Georgy = new Cats("тигр", "Жора");
    public static Hypo Dousya = new Hypo("Дуся");
    public static ZooDoctor player = new ZooDoctor();
    public static ZooKeeper player1 = new ZooKeeper();
    public static Human[] humans = new Human[]{player, player1};

    private static boolean playerStatus = true; // условие для прерывания цикла при выходе из метода

    public static boolean getPlayerStatus() {
        return playerStatus;
    }

    public static void setPlayerStatus(boolean x) {
        playerStatus = x;
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк!");
        System.out.println("Вам предстоит прогуляться по территории" + " и взаимодействовать с животными в роли доктора или смотрителя.");

        do {
            int acceptPlayer;

            do {
                System.out.println("""
                        Выберите, кем будете играть:
                        нажмите 0 если доктором, 1 если смотрителем.\s
                        Если число будет другое, то алгоритм выберет роль за вас""");
                acceptPlayer = (int) (Functions.getNumber() % 2);
                if (acceptPlayer == 0) {
                    System.out.println("Ваш выбор - играть доктором");
                    setPlayerStatus(false);
                    if (player.getBitten()) {
                        System.out.println("Этот персонаж сейчас ранен, " + "чтобы наложить повязку нажмите 1, чтобы поменять персонажа нажмите 0");
                        int acceptPlayer2 = (int) (Functions.getNumber() % 2);
                        setPlayerStatus(true);
                        if (acceptPlayer2 == 1) {
                            player.setBitten(false);
                            setPlayerStatus(false);
                        }
                    }

                } else {
                    System.out.println("Ваш выбор - играть смотрителем");
                    setPlayerStatus(false);
                    if (player.getBitten()) {
                        System.out.println("""
                                Этот персонаж сейчас ранен,\s
                                чтобы обратиться к доктору и наложить повязку нажмите 1,\s
                                чтобы поменять персонажа нажмите 0""");
                        int acceptPlayer2 = (int) (Functions.getNumber() % 2);
                        setPlayerStatus(true);
                        if (acceptPlayer2 == 1) {
                            player1.setBitten(false);
                            setPlayerStatus(false);
                        }
                    }

                }
            } while (getPlayerStatus());

            do {
                System.out.println("""
                        Вы заходите на территорию и видите 5 клеток с животными:
                        1я клетка - белка Ловкач, 2я клетка - белка Стрелка
                        3я клетка - лев Кузя, 4я - тигр Жора, 5я - бегемот Дуся""");
                System.out.println("""
                        Выберите животное, к которому хотите подойти, введя номер его клетки
                        Если вы введёте несуществующий номер клетки, то выбор произойдет автоматически""");

                int acceptAnimal = (int) (Functions.getNumber() % 6);
                while (acceptAnimal == 0) {
                    System.out.println("повторите ввод числа");
                    acceptAnimal = (int) (Functions.getNumber() % 6);
                }

                switch (acceptAnimal) {
                    case 1 -> humans[acceptPlayer].goToAnimal(Lovkatch);
                    case 2 -> humans[acceptPlayer].goToAnimal(Strelka);
                    case 3 -> humans[acceptPlayer].goToAnimal(Kyzua);
                    case 4 -> humans[acceptPlayer].goToAnimal(Georgy);
                    case 5 -> humans[acceptPlayer].goToAnimal(Dousya);
                }
            } while (playerStatus);

            //условие выхода из игры или продолжение
            System.out.println("Чтобы покинуть игру нажмите 1, " + "чтобы вернуться к выбору персонажа - 0");
            int i = (int) Functions.getNumber() % 2;

            setPlayerStatus(i == 0);

        } while (getPlayerStatus());

        System.out.println("Спасибо, что были с нами! До новых встреч!");


    } //скобка метода


} //скобка класса

