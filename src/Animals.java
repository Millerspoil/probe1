public class Animals {
    private boolean iWantEat;   // тру если голодное
    private boolean goodHealth;   // тру если здоровое
    private boolean agression;  //тру тогда  укусит

    public boolean getAgr(){
        return agression;
    }
    public void setAgr(boolean x){
        agression = x;
    }
    public boolean getEatStatus(){
        return iWantEat;
    }
    public void setEatStatus(boolean x){
        iWantEat = x;
    }
    public boolean getHealth(){
        return goodHealth;
    }
    public void setHealth(boolean x){
        goodHealth = x;
    }
}
