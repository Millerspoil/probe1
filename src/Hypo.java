public class Hypo extends Animals {
    private final String name;
    public String getName(){
        return name;
    }
    private boolean waterInPool;

    public boolean getWaterPool() {
        return waterInPool;
    }
    public void setWaterInPool(boolean x) {
        waterInPool = x;
    }
    public Hypo(String name) {
        this.name = name;
        int random = (int)(Math.random()*100);
        if(random<35) {
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
