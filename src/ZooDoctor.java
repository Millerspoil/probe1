public class ZooDoctor extends Human {
    // здоровье, (карантин) , может быть покусан.


    public void goToAnimal(Cats animal) {
        System.out.println("Перед Вами " + animal.getCatsType() + "по имени " + animal);
        if (animal.getAgression()) {
            System.out.println("Вы открываете клетку животным и видите его злобный взгляд, " +
                    "\nно это Вас не останавливает, ведь Вы должны проверить здоровье подопечного." +
                    "Но попытка подойти к " + animal + " приводит к укусу, и Вы вынуждены ретироваться!");

            System.out.println("Вам необходимо наложить повязку, чтобы продолжить играть доктором." +
                    "Если хотите наложить повязку - введите 1, если хотите сменить персонажа - 0.");
            long i = Functions.getNumber();
            int j = (int) i % 2;
            if(j==0) return;
        }
        System.out.println("Вы открываете клетку, заходите к животному и слышите довольное урчание " +
                "- кошка рада вашему присутствию!");



    }


    public boolean goToAnimal(Hypo animal) {

        return false;
    }

    public boolean goToAnimal(Squirrel animal) {

        return false;
    }

}
//добивать переменную в карантине для животных