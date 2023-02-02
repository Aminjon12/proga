package Others;
import utils.*;

public class CookedEgg {
    private static int amount;
    public CookedEgg(int amount){
        this.amount=amount;
    }
    public static class Eggs{
        public static Ingridients[] masEggs(int amount){
            Ingridients[] eggs = new Ingridients[amount+1];
            for(int i=0;i<amount+1;i++){
                eggs[i]=Ingridients.EGG;
            }
            return eggs;
        }
        public String toString(){
            return getAmount()+" eggs";
        }
    }

    public static int getAmount() {
        return amount;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CookedEgg cookedEgg = (CookedEgg) o;
        return amount == cookedEgg.amount;
    }
    @Override
    public String toString(){
        return "Huge Cooked Egg from " +amount + Ingridients.EGG.getIng() + "s";
    }
}
