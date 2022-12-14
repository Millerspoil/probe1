public class ZooDoctor extends Human {


    public void goToAnimal(Cats animal) {

        System.out.println("Перед Вами " + animal.getCatsType() + " по имени " + animal.getName());
        if (animal.getIsolate()) {
            System.out.println(animal.getName() + " сейчас находится в карантине." +
                    "\n Вы можете провести лечебные мероприятия и вылечить его." +
                    "\nЕсли хотите вылечить животное нажмите 1, " +
                    "\nесли хотите уйти к другому животному, нажмите 0");
            int i = (int) Functions.getNumber() % 2;
            if (i == 0) {
                Main.setPlayerStatus(true);
                System.out.println("Вы покидаете клетку и идете на общую территорию");
                return;
            } else {
                animal.setIsolate(false);
                System.out.println("Животное успешно вылечено и возвращено в привычную клетку."); //можно придумать процесс лечения
            }

        }

        if (animal.getAgression()) {
            System.out.println("Вы открываете клетку животным и видите его злобный взгляд, " +
                    "\nно это Вас не останавливает, ведь Вы должны проверить здоровье подопечного. " +
                    "Но попытка подойти к нему приводит к укусу, и Вы вынуждены ретироваться!");

            System.out.println("Вам необходимо наложить себе повязку, чтобы продолжить играть доктором. " +
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
                System.out.println("Вы подходите к зверю, достаете градусник, " +
                        "пытаетесь схватить кошачий хвост," +
                        "\n но голодному животному это не нравится, " +
                        "и вы получаете сильный удар лапой.");

                System.out.println("Вам необходимо наложить себе повязку, " +
                        "Если хотите наложить повязку сейчас - введите 1, " +
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
                Main.setPlayerStatus(true);
                return;
            }

        }

        System.out.println("Вы подходите к животному и начинаете его осматривать.");

        if (animal.getGoodHealth()) {
            System.out.println("Вам удается полностью осмотреть животное " +
                    "и Ваш вердикт - питомец здоров!");
            animal.setHair(true);
        } else {
            System.out.println("Вам сразу бросается в глаза нездоровый вид подопечного" +
                    "и Вы принимаете решение отправить его в карантин");
            System.out.println();
            System.out.println("Вы выходите из клетки");
            System.out.println();
            animal.setIsolate(true);

        }
        int i = (int) Functions.getNumber() % 2;
        System.out.println("Чтобы продолжить играть доктором нажмите 1," +
                "\nдля смены персонажа нажмите 0");
        if (i == 0) {
            Main.setPlayerStatus(false);
        }

        Main.setPlayerStatus(true);
    }

    public void goToAnimal(Hypo animal) {

        System.out.println("Перед Вами бегемотик по имени " + animal.getName());
        if (animal.getIsolate()) {
            System.out.println(animal.getName() + " сейчас находится в карантине." +
                    "\nВы можете провести лечебные мероприятия и вылечить её(его)." +
                    "\nЕсли хотите вылечить бегемота нажмите 1, " +
                    "\nесли хотите уйти к другому животному, нажмите 0");
            int i = (int) Functions.getNumber() % 2;
            if (i == 0) {
                Main.setPlayerStatus(true);
                System.out.println("Вы покидаете клетку и идете на общую территорию");
                return;
            } else {
                animal.setIsolate(false);
                System.out.println("Животное успешно вылечено и возвращено в привычную клетку."); //можно придумать процесс лечения
            }

        }
        if (animal.getAgression()) {
            System.out.println("""
                    Вы открываете клетку с бегемотом и видите его недовольный вид,\s
                    но это Вас не останавливает, ведь Вы должны проверить здоровье подопечного.\s
                    Ваше приближение не устраивает местного обитателя,\s
                    и животное отгоняет вас, кусая за левую ногу""");

            System.out.println("Вам необходимо наложить себе повязку, чтобы продолжить играть доктором. " +
                    "\nЕсли хотите наложить повязку сейчас - введите 1, если хотите сменить персонажа - 0.");
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

        System.out.println("Вы открываете клетку и видите мирно лежащего на краю бассейна бегемота");
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
                System.out.println("Вы подходите к бегемоту, достаете градусник, " +
                        "пытаетесь схватить питомца за хвост." +
                        "\n Но голодному животному это не нравится, " +
                        "о чем зверь и предупреждает Вас, слегка прикусывая Вам правую ногу.");

                System.out.println("Вам необходимо наложить себе повязку, " +
                        "Если хотите наложить повязку сейчас - введите 1, " +
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

                System.out.println("Чтобы продолжить играть доктором, нажмите 1. " +
                        "\nЕсли хотите сменить персонажа нажмите 0.");

                int m = (int) Functions.getNumber() % 2;
                if (m == 0) {
                    Main.setPlayerStatus(false);
                    return;
                }
                Main.setPlayerStatus(true);
                return;
            }
        }
        System.out.println("Вы подходите к животному и начинаете его осматривать.");
        if (animal.getGoodHealth()) {
            System.out.println("Вам удается полностью осмотреть животное " +
                    "и Ваш вердикт - питомец здоров!");
        } else {
            System.out.println("Вам сразу бросается в глаза нездоровый вид подопечного" +
                    "и Вы принимаете решение отправить его в карантин");
            System.out.println();
            System.out.println("Вы выходите из клетки");
            System.out.println();
            animal.setIsolate(true);
        }
        System.out.println("Чтобы продолжить играть доктором, нажмите 1. " +
                "\nЕсли хотите сменить персонажа нажмите 0.");

        int m = (int) Functions.getNumber() % 2;
        if (m == 0) {
            Main.setPlayerStatus(false);
            return;
        }
        Main.setPlayerStatus(true);

    }

    public void goToAnimal(Squirrel animal) {

        double chance = Math.random()*100;
        if (chance < 30) {
            animal.setInCage(false);
        }
        System.out.println("Перед Вами клетка с белкой по имени " + animal.getName());
        if (animal.getIsolate()) {
            System.out.println(animal.getName() + " сейчас находится в карантине." +
                    "\n Вы можете провести лечебные мероприятия и вылечить её(его)." +
                    "\nЕсли хотите вылечить белку нажмите 1, " +
                    "\nесли хотите уйти к другому животному, нажмите 0");
            int i = (int) Functions.getNumber() % 2;
            if (i == 0) {
                Main.setPlayerStatus(true);
                System.out.println("Вы покидаете клетку и идете на общую территорию");
                return;
            } else {
                animal.setIsolate(false);
                System.out.println("Животное успешно вылечено и возвращено в привычную клетку."); //можно придумать процесс лечения
            }

        }

        if (!animal.getInCage()) {
            System.out.println("""
                    Вы заходите в клетку, но не можете найти ее обитателя.
                    Вам срочно нужно отправляться на поиски!
                    Чтобы пойти искать белку нажмите 1,
                    если хотите уйти к другому животному, нажмите 0""");
            int i = (int) Functions.getNumber() % 2;
            if (i == 0) {
                Main.setPlayerStatus(true);
                System.out.println("Вы покидаете клетку и идете на общую территорию");
                return;
            } else {
                animal.setInCage(true);
                System.out.println("Вы отправляетесь на поиски, но сразу же" +
                        "\nобнаруживаете питомца в соседнем вольере и возвращаете его в привычную клетку.");
            }

        }
        System.out.println("\n\n");
        if (animal.getAgression()) {
            System.out.println("""
                    Вы открываете клетку с бельчонком и замечаете его беспокойство,\s
                    но это Вас не останавливает, ведь Вы должны проверить здоровье подопечного.\s
                    Ваше приближение не устраивает местного обитателя.\s
                    Как только Вы протягиваете руки, грызун впивается Вам в палец острыми зубками.""");

            System.out.println("Вам необходимо наложить себе повязку, чтобы продолжить играть доктором. " +
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

        System.out.println("Вы открываете клетку, и местный житель мгновенно бросается к Вам.");

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
                System.out.println("""
                        Вы берете белку в руки, достаете градусник,\s
                        пытаетесь схватить питомца за хвост.
                        Но голодному животному это не нравится,
                        и он кусает Вас своими острыми зубками прямо в руку.""");

                System.out.println("""
                        Вам необходимо наложить себе повязку,\s
                        Если хотите наложить повязку сейчас - введите 1,\s
                        если хотите сменить персонажа - 0.""");
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

                System.out.println("Если Вы хотите продолжить играть доктором, нажмите 1. " +
                        "\nЕсли хотите сменить персонажа нажмите 0.");

                int m = (int)Functions.getNumber()%2;
                if (m == 0) {
                    Main.setPlayerStatus(false);
                    return;
                }
                Main.setPlayerStatus(true);
                return;
            }
        }

        System.out.println("Вы подходите к животному и начинаете его осматривать.");
        if (animal.getGoodHealth()) {
            System.out.println("Вам удается полностью осмотреть животное " +
                    "и Ваш вердикт - питомец здоров!");
        } else {
            System.out.println("Вам сразу бросается в глаза нездоровый вид подопечного" +
                    "и Вы принимаете решение отправить его в карантин");
            System.out.println();
            System.out.println("Вы выходите из клетки");
            System.out.println();
            animal.setIsolate(true);
        }
        System.out.println("Чтобы продолжить играть доктором, нажмите 1. " +
                "\nЕсли хотите сменить персонажа нажмите 0.");

        int m = (int)Functions.getNumber()%2;
        if (m == 0) {
            Main.setPlayerStatus(false);
            return;
        }

        Main.setPlayerStatus(true);

    }

}
