public class Human {
    private boolean bitten = false;   // если тру, то укушен

    public void setBitten(boolean bitten) {
        this.bitten = bitten;
    }

    public boolean getBitten() {
        return bitten;
    }

    public void goToAnimal(Cats animal) {
    }

    public void goToAnimal(Hypo animal) {
    }

    public void goToAnimal(Squirrel animal) {
    }
}

