public class Animals {
    private boolean iWantEat;  // если тру то голодный
    private boolean agression; // если тру то укусит
    private boolean goodHealth; // если тру то здоров

    public void setAgression(boolean agression) {
        this.agression = agression;
    }

    public boolean getAgression() {
        return agression;
    }

    public boolean getGoodHealth() {
        return goodHealth;
    }

    public void setGoodHealth(boolean goodHealth) {
        this.goodHealth = goodHealth;
    }

    public void setEatStatus(boolean iWantEat) {
        this.iWantEat = iWantEat;
    }
    public boolean getEatStatus() {
        return iWantEat;
    }
}

