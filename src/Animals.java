public class Animals  {
    private boolean iWantEat;  // если тру, то голодный
    private boolean agression; // если тру, то укусит
    private boolean goodHealth; // если тру, то здоров

    private boolean isolate = false;  //если тру, то сидит в карантине

    public boolean getIsolate() {
        return isolate;
    }

    public void setIsolate(boolean isolate) {
        this.isolate = isolate;
    }

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

    public Animals() {

        int random = (int) (Math.random() * 100);
        if (random < 35) {
            iWantEat = true;
            agression = false;
            goodHealth = true;
        } else if (random < 67) {
            iWantEat = false;
            agression = true;
            goodHealth = true;
        } else {
            iWantEat = true;
            agression = false;
            goodHealth = false;
        }

    }
}

