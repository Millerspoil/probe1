public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк!");
        System.out.println("Вам предстоит прогуляться по территории" +
                " и взаимодействовать с животными в роли доктора или смотрителя.");
        System.out.println("Для начала выберите, кем будете играть: нажмите 1 если доктором, 0 если смотрителем");



        Hypo ruby = new Hypo();

        System.out.println("укусит?" + ruby.getAgression() + "голодный?" + ruby.getEatStatus() + "здоров?" +ruby.getGoodHealth() + ruby.getWaterPool());



    }
}
