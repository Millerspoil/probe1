import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк!");
        System.out.println("Вам предстоит прогуляться по территории" +
                " и взаимодействовать с животными в роли доктора или смотрителя.");
        System.out.println("Для начала выберите, кем будете играть: нажмите 1 если доктором, 0 если смотрителем");
        ZooDoctor Doctor = new ZooDoctor();
        ZooKeeper zooKeeper = new ZooKeeper();
        Squirrel Lovkatch = new Squirrel();
        Squirrel Strelka = new Squirrel();
        Cats Kyzua = new Cats("lion");
        Cats Georgy = new Cats("tiger");
        Hypo Dousya = new Hypo();


        Scanner scanner = new Scanner(System.in);







    }
}
