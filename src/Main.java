public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк!");
        System.out.println("Вам предстоит прогуляться по территории" +
                " и взаимодействовать с животными в роли доктора или смотрителя.");
        System.out.println("Для начала выберите, кем будете играть: нажмите 1 если доктором, 0 если смотрителем");



        Cats lion = new Cats();

        System.out.println("укусит?" + lion.getAgression() + "голодный?" + lion.getEatStatus() + "здоров?" +lion.getGoodHealth());



    }
}
