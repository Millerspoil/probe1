public class ZooDoctor extends Human {
    // здоровье, (карантин) , может быть покусан.


    public void goToAnimal(Cats animal) {

        System.out.println("Перед Вами " + animal.getCatsType() + " по имени " + animal.getName());
        if (animal.getIsolate()) {
            System.out.println(animal.getName() + " сейчас находится в карантине." +
                    "\n Вы можете провести лечебные мероприятия и вылечить его." +
                    "\nЕсли хотите вылечить животное нажмите 1, " +
                    "\nесли хотите уйти к другому животному, нажмите 0");
            int i = (int) Functions.getNumber() % 2;
            if (i == 0) {
                System.out.println("Вы покидаете клетку и идете на общую территорию");
                return;
            } else {
                animal.setIsolate(false);
                System.out.println("Животное успешно вылечено и возвращено в привычную клетку."); //можно придумать процесс лечения
            }

        }
        if (animal.getAgression()) {
            System.out.println("Вы открываете клетку животным и видите его злобный взгляд, " +
                    "\nно это Вас не останавливает, ведь Вы должны проверить здоровье подопечного." +
                    "Но попытка подойти к нему приводит к укусу, и Вы вынуждены ретироваться!");

            System.out.println("Вам необходимо наложить себе повязку, чтобы продолжить играть доктором." +
                    "Если хотите наложить повязку сейчас - введите 1, если хотите сменить персонажа - 0.");
            setBitten(true);
            int j = (int) Functions.getNumber() % 2;
            if (j == 0) {
                Main.setPlayerStatus(false);
                animal.setAgression(false);
                return;
            }
            setBitten(false);
            System.out.println("Вы успешно обработали рану и снова подходите к клетке");
            animal.setAgression(false);
        }

        System.out.println("Вы открываете клетку, заходите к животному и слышите довольное урчание " +
                "- кошка рада вашему присутствию!");
        if (animal.getEatStatus()) {
            System.out.println("""
                    При приближении к зверю Вы ясно чувствуете - от Вас чего то ждут.
                    Так и есть, вы оглядываетесь и замечаете пустую миску.
                    Прежде чем провести диагностические мероприятия необходимо покормить животное,
                    иначе есть риск быть укушенным. Но для этого нужно переключиться 
                    на смотрителя, дойти до нужного животного и накормить его.
                    Чтобы переключиться нажмите 0, чтобы остаться в клетке и попробовать
                    осмотреть зверя - нажмите 1""");
            int i = (int) Functions.getNumber() % 2;
            if (i == 0) {
                Main.setPlayerStatus(false);
                return;
            }
            double k = Math.random() * 100;
            if (k < 60) {
                animal.setAgression(true);
            }
            if (animal.getAgression()) {
                System.out.println("Вы подходите к зверю, достаете градусник" +
                        "пытаетесь схватить кошачий хвост, но голодному животному это не нравится" +
                        "и вы получаете сильный удар лапой.");

                System.out.println("Вам необходимо наложить себе повязку," +
                        "Если хотите наложить повязку сейчас - введите 1," +
                        "если хотите сменить персонажа - 0.");
                setBitten(true);
                int j = (int) Functions.getNumber() % 2;
                if (j == 0) {
                    Main.setPlayerStatus(false);
                    animal.setAgression(false);
                    return;
                }
                setBitten(false);
                System.out.println("Вы успешно обработали рану но не можете подходить к зверю, пока он голоден");
                animal.setAgression(true);
                Main.setPlayerStatus(false);
                return;
            }
            System.out.println("Вы подходите к животному и начинаете его осматривать.");
            if (animal.getGoodHealth()) {
                System.out.println("Вам удается полностью осмотреть животное " +
                        "и Ваш вердикт - питомец здоров!");
            } else {
                System.out.println("Вам сразу бросается в глаза нездоровый вид подопечного" +
                        "и Вы принимаете решение отправить его в карантин");
                animal.setIsolate(true);
            }


        }

        Main.setPlayerStatus(true);
    }


    public void goToAnimal(Hypo animal) {

        System.out.println("Перед Вами  бегемотик по имени " + animal);
        if (animal.getAgression()) {
            System.out.println("Вы открываете клетку животным и видите его злобный взгляд, " +
                    "\nно это Вас не останавливает, ведь Вы должны проверить здоровье подопечного." +
                    "Но попытка подойти к " + animal + " приводит к укусу, и Вы вынуждены ретироваться!");

            System.out.println("Вам необходимо наложить повязку, чтобы продолжить играть доктором." +
                    "Если хотите наложить повязку - введите 1, если хотите сменить персонажа - 0.");
            long i = Functions.getNumber();
            int j = (int) i % 2;
            if (j == 0) return;
        }
        System.out.println("Вы открываете клетку, заходите к животному и слышите довольное урчание " +
                "- кошка рада вашему присутствию!");


    }

    public void goToAnimal(Squirrel animal) {

        System.out.println("Перед Вами белка по имени " + animal);
        if (animal.getAgression()) {
            System.out.println("Вы открываете клетку животным и видите его злобный взгляд, " +
                    "\nно это Вас не останавливает, ведь Вы должны проверить здоровье подопечного." +
                    "Но попытка подойти к " + animal + " приводит к укусу, и Вы вынуждены ретироваться!");

            System.out.println("Вам необходимо наложить повязку, чтобы продолжить играть доктором." +
                    "Если хотите наложить повязку - введите 1, если хотите сменить персонажа - 0.");
            long i = Functions.getNumber();
            int j = (int) i % 2;
            if (j == 0) return;
        }
        System.out.println("Вы открываете клетку, заходите к животному и слышите довольное урчание " +
                "- кошка рада вашему присутствию!");


    }

}
//добивать переменную в карантине для животных