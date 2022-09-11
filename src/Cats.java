public class Cats extends Animals {
    private String name;
    public String getName(){
        return name;
    }
    private boolean shaggyHair;
    private final String catsType;

    public String getCatsType() {
        return catsType;
    }

    public boolean getHair() {
        return shaggyHair;
    }

    public void setHair(boolean x) {
        shaggyHair = x;
    }

    public Cats(String type, String name) {
        this.name = name;
        catsType = type;
        int random = (int) (Math.random() * 100);
        if (random < 35) {
            setEatStatus(true);
            setAgression(false);
            setGoodHealth(true);
            setHair(false);
        } else if (random < 67) {
            setEatStatus(false);
            setAgression(true);
            setGoodHealth(true);
            setHair(false);
        } else {
            setEatStatus(true);
            setAgression(false);
            setGoodHealth(false);
            setHair(true);
        }
    }
}
