public class Functions {

    public static Animals acceptAnimal(int x) {

        Animals animals = null;
        switch (x) {
            case 1:
                animals = Main.Lovkatch;
                break;
            case 2:
                animals = Main.Strelka;
                break;
            case 3:
                animals = Main.Kyzua;
                break;
            case 4:
                animals = Main.Georgy;
                break;
            case 5:
                animals = Main.Dousya;
                break;

        }
        return animals;
    }
}
