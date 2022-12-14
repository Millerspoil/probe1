public class Squirrel extends  Animals {
    private final String name;
    public String getName(){
        return name;
    }
    private boolean inCage;    //  если тру, то белка в клетке

    public void setInCage(boolean x) {
        inCage = x;
    }

    public boolean getInCage() {
        return inCage;
    }

    public Squirrel(String name) {
        this.name = name;

        int random = (int) (Math.random() * 100);
        if (random < 35) {
            setEatStatus(true);
            setAgression(false);
            setGoodHealth(true);
            setInCage(false);
        } else if (random < 67) {
            setEatStatus(false);
            setAgression(true);
            setGoodHealth(true);
            setInCage(false);
        } else {
            setEatStatus(true);
            setAgression(false);
            setGoodHealth(false);
            setInCage(true);
        }

    }
}
