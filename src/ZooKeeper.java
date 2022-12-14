public class ZooKeeper extends Human {


    public void goToAnimal(Cats animal) {
        System.out.println("Перед Вами " + animal.getCatsType() + " по имени " + animal.getName());
        if (animal.getIsolate()) {
            System.out.println(animal.getName() + " находится в карантине." +
                    "\nСейчас Вы не можете с ним взаимодействовать.");
            Main.setPlayerStatus(true);
            System.out.println("Если Вы хотите сменить персонажа нажмите 0," +
                    "если хотите пойти к другому животному, нажмите 1");
            int i = (int) (Functions.getNumber() % 2);
            if (i == 1) {
                Main.setPlayerStatus(true);
                return;
            } else {
                Main.setPlayerStatus(false);
                return;
            }

        }
        if (animal.getAgression()) {
            System.out.println("""
                    Вы открываете клетку с животным и замечаете его грозный оскал,\s
                    но это Вас не останавливает, ведь Вы должны накормить подопечного.\s
                    Ваше приближение не устраивает хищника, он грозно рычит, оскалив зубы.\s
                    Беспокоясь за свою жизнь, вы покидаете клетку.""");

            animal.setAgression(false);
            Main.setPlayerStatus(true);
            System.out.println("Если Вы хотите сменить персонажа нажмите 0," +
                    "если хотите пойти к другому животному, нажмите 1");
            int i = (int) (Functions.getNumber() % 2);
            if (i == 1) {
                Main.setPlayerStatus(true);
                return;
            } else {
                Main.setPlayerStatus(false);
                return;
            }
        }

        System.out.println("Вы открываете клетку, и местный житель приветствует Вас громким урчанием.");

        if (animal.getEatStatus()) {
            System.out.println("""
                    При приближении к зверю Вы ясно чувствуете - от Вас чего то ждут.
                    Так и есть, вы оглядываетесь и замечаете пустую миску.
                    Чтож, пора заняться работой. Вы подходите к миске,
                    Достаете огромный кусок мяса и кладете его животному.""");
            animal.setEatStatus(false);
            double k = Math.random() * 100;
            if (k < 20) {
                animal.setAgression(true);
            }
            if (animal.getAgression()) {
                System.out.println("Увидев мясо, зверь стремглав несется к миске. " +
                        "Он так сильно голоден, что не дает Вам положить мясо " +
                        "\n И кусает его вместе с Вашей рукой. ");

                System.out.println("""
                        Вам необходимо обратиться к доктору и наложить повязку,\s
                        Если хотите наложить повязку сейчас - введите 1,\s
                        если хотите сменить персонажа - 0.""");
                setBitten(true);
                animal.setAgression(false);
                int j = (int) Functions.getNumber() % 2;
                if (j == 0) {
                    Main.setPlayerStatus(false);
                    return;
                }
                setBitten(false);
                System.out.println("Вам успешно обработали рану, и Вы можете возвращаться к работе.");
            }

            System.out.println(animal.getName() + "с удовольствием принимает угощение, а Вы продолжаете работать");
        }

        System.out.println("Поняв, что животное сытое, Вы приступаете к дальнейшим действиям.");
        if (animal.getHair()) {
            System.out.println("Вы достаете щетку для шерсти и приступаете к вычесыванию питомца");
            animal.setHair(false);
        } else {
            System.out.println("После внимательного осмотра Вы делаете вывод, " +
                    "\nчто животное в вычесывании шерсти не нуждается");
            System.out.println();
            System.out.println("Вы выходите из клетки");
            System.out.println();
            animal.setHair(true);
        }

        Main.setPlayerStatus(true);

    }

    public void goToAnimal(Hypo animal) {
        System.out.println("Перед Вами бегемотиха по имени " + animal.getName());
        if (animal.getIsolate()) {
            System.out.println(animal.getName() + " находится в карантине." +
                    "\nСейчас Вы не можете с ней взаимодействовать.");
            Main.setPlayerStatus(true);
            System.out.println("Если Вы хотите сменить персонажа нажмите 0," +
                    "если хотите пойти к другому животному, нажмите 1");
            int i = (int) (Functions.getNumber() % 2);
            if (i == 1) {
                Main.setPlayerStatus(true);
                return;
            } else {
                Main.setPlayerStatus(false);
                return;
            }

        }

        if (animal.getAgression()) {
            System.out.println("""
                    Вы открываете клетку с животным и замечаете его недовольный вид,\s
                    но это Вас не останавливает, ведь Вы должны накормить подопечного.\s
                    Ваше приближение не устраивает бегемота, и зверь нападает, кусая вас в ногу.""");

            System.out.println("Вам необходимо обратиться к доктору, чтобы наложить повязку. " +
                    "\nЕсли хотите наложить повязку сейчас - введите 1, если хотите сменить персонажа - 0.");
            setBitten(true);
            int j = (int) Functions.getNumber() % 2;
            if (j == 0) {
                Main.setPlayerStatus(false);
                animal.setAgression(false);
                return;
            }
            setBitten(false);
            System.out.println("Вам успешно обработали рану, и Вы снова подходите к клетке");
            animal.setAgression(false);
            System.out.println("Если Вы хотите пойти к другому животному, нажмите 0," +
                    "если хотите снова зайти к бегемоту, нажмите 1");
            int i = (int) (Functions.getNumber() % 2);
            if (i == 0) {
                Main.setPlayerStatus(true);
                return;
            }
        }

        System.out.println("Вы открываете клетку, и видите, что бегемот лениво валяется около бассейна");

        if (animal.getEatStatus()) {
            System.out.println("""
                    При приближении к зверю Вы ясно чувствуете - от Вас чего то ждут.
                    Так и есть, вы оглядываетесь и замечаете пустую миску.
                    Чтож, пора заняться работой. Вы подходите к миске,
                    Достаете порцию корма и кладете его животному.""");
            animal.setEatStatus(false);

            System.out.println(animal.getName() + "с удовольствием принимает угощение, а Вы продолжаете работать");
        }

        System.out.println("Поняв, что животное сытое, Вы приступаете к дальнейшим действиям.");

        if (animal.getWaterPool()) {

            System.out.println("Вы обращаете внимание, что вода в бассейне бегемота грязная. " +
                    "Вы спускаете воду и начинаете чистить бассейн.");
            animal.setWaterInPool(false);
            double i = Math.random() * 100;
            if (i < 20) {
                System.out.println("""
                        На вычищенном до блеска полу вы теряете равновесие и подскальзываетесь.
                        Вы не можете самостоятельно встать и зовете  на помощь доктора.
                        Доктор помогает вам выйти из клетки и дойти до мед пункта.""");
                setBitten(true);
                Main.setPlayerStatus(false);
                return;
            }
        } else {
            System.out.println("После внимательного осмотра Вы делаете вывод, " +
                    "\nчто бассейн у бегемота в чистке не нуждается");
            System.out.println();
            System.out.println("Вы выходите из клетки");
            System.out.println();
            animal.setWaterInPool(true);
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
            System.out.println(animal.getName() + " сейчас находится в карантине," +
                    "\n поэтому Вы не можете взаимодействовать с животным." +
                    "\nЕсли хотите сменить персонажа и вылечить белку нажмите 1, " +
                    "\nесли хотите уйти к другому животному, нажмите 0");
            int i = (int) Functions.getNumber() % 2;
            if (i == 0) {
                Main.setPlayerStatus(true);
                System.out.println("Вы покидаете клетку и идете на общую территорию");
                return;
            } else {
                Main.setPlayerStatus(false);
                return;
            }
        }

        if (!animal.getInCage()) {
            System.out.println("""
                    Вы заходите в клетку, но не можете найти ее обитателя.
                    Вам срочно нужно отправляться на поиски!
                    Чтобы пойти искать белку нажмите 1,
                    если хотите уйти к другому животному, нажмите 0.""");
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

        if (animal.getAgression()) {
            System.out.println("""
                    Вы открываете клетку с бельчонком и замечаете его беспокойство,\s
                    но это Вас не останавливает, ведь Вам нужно его накормить.\s
                    Ваше приближение не устраивает местного обитателя.\s
                    Как только Вы протягиваете руки, грызун впивается Вам в палец острыми зубками.""");

            System.out.println("Вам необходимо обратиться к доктору и наложить повязку. " +
                    "\nЕсли хотите наложить повязку сейчас - введите 1, если хотите сменить персонажа - 0.");
            setBitten(true);
            int j = (int) Functions.getNumber() % 2;
            if (j == 0) {
                Main.setPlayerStatus(false);
                animal.setAgression(false);
                return;
            }
            setBitten(false);
            System.out.println("Вам успешно обработали рану, и Вы снова подходите к клетке");
            animal.setAgression(false);
        }

        System.out.println("Вы открываете клетку, и местный житель мгновенно бросается к Вам.");

        if (animal.getEatStatus()) {
            System.out.println("""
                    При приближении к зверю Вы ясно чувствуете - от Вас чего то ждут.
                    Так и есть, вы оглядываетесь и замечаете пустую миску.
                    Чтож, Вам пора заняться работой. Вы достаете из сумки корм и насыпаете в миску.""");
            animal.setEatStatus(false);
        } else {
            System.out.println("Вы видите, что миска у белки полная, животное довольно жизнью." +
                    "\nВы решаете немного поиграть с бельчонком.");
        }
        System.out.println("Наигравшись в свое удовольствие, вы покидаете клетку");
        animal.setAgression(true);
        Main.setPlayerStatus(true);
    }

}
