public class Animals {
    private boolean iWantEat;   // ��� ���� ��������
    private boolean goodHealth;   // ��� ���� ��������
    private boolean agression;  //��� �����  ������

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
