public class Human {


    private boolean bitten;   // если тру то укушен

    public void setBitten(boolean bitten) {
        this.bitten = bitten;
    }

    public boolean getBitten() {
        return bitten;
    }

    public boolean goToAnimal(Animals animal) {
        return false;
    }


    // здоровье, (карантин) , может быть покусан.

}

