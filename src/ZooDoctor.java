public class ZooDoctor extends Human {
    // здоровье, (карантин) , может быть покусан.



    public boolean goToAnimal(Cats animal) {
        System.out.println("Перед Вами " + animal.getCatsType() + "по имени " + animal);
        if (animal.getAgression()) {
            System.out.println("Вы открываете клетку животным и видете его злобный взгляд, " +
                    "\nно это Вас не останавливает, ведь Вы должны проверить здоровье подопечного." +
                    "Но попытка подойти к " + animal + " приводит к укусу, и Вы вынуждены ретироваться!");
            return false;
        }


        return true;
    }


    public boolean goToAnimal(Hypo animal) {

        return false;
    }

    public boolean goToAnimal(Squirrel animal) {

        return false;
    }

}
//добивать переменную в карантине для животных