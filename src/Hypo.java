public class Hypo extends Animals {
    private final String NAME;

    public String getName() {
        return NAME;
    }

    private boolean waterInPool; //  если вода грязная, то тру

    public boolean getWaterPool() {
        return waterInPool;
    }

    public void setWaterInPool(boolean x) {
        waterInPool = x;
    }

    public Hypo(String name) {
        this.NAME = name;
        int random = (int) (Math.random() * 100);
        if (random < 35) {
            setEatStatus(true);
            setAgression(false);
            setGoodHealth(true);
            setWaterInPool(false);
        } else if (random < 67) {
            setEatStatus(false);
            setAgression(true);
            setGoodHealth(true);
            setWaterInPool(false);
        } else {
            setEatStatus(true);
            setAgression(false);
            setGoodHealth(false);
            setWaterInPool(true);
        }
    }
}
