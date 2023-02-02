import exceptions.AreGuysAliveException;
import exceptions.EggAmountException;
import people.*;
import utils.*;
import Others.*;
import utils.places.Places;

public class Main {
    public static void main(String[] args) {
        Spruts spruts = new Spruts("Spruts", false, true,true);
        Julio julio = new Julio("Julio", true, true, true);
        if(!julio.isHeAlive() || !spruts.isHeAlive()){
            throw new AreGuysAliveException("BRO IS DEAD");
        }
        toDinner dinner = new toDinner() {
            @Override
            public void toDinner(Julio julio, Spruts spruts) {
                System.out.println("both are having " + EatnCook.DINNER.getEatingTime());
            }
        };
        spruts.invited(julio, Places.ROOM);
        spruts.going(Places.KITCHEN, julio);
        Obj chair = new Obj("chair");
        Obj stove = new Obj("stove");
        spruts.breaksAndFires(chair, 2,"fire a ", stove);
        Obj pants = new Obj("pants");
        Obj pan = new Obj("pan");
        spruts.shaterringAndReliesing(CookedEgg.Eggs.masEggs(20)[0],pants,pan);
        spruts.deciding(spruts.getName()+" won't have "+ EatnCook.DINNER.getEatingTime());
        Obj biggerPan = new Obj("pan","bigger");
        julio.took(CookedEgg.Eggs.masEggs(20));
        try{
            julio.choosingAndBuilding(biggerPan,20);
            if(CookedEgg.getAmount()<0){
                throw new EggAmountException();
            }
        } catch (EggAmountException e) {
            System.out.println("exception!!! "  + e.toString());
            return;
        }
        dinner.toDinner(julio, spruts);
        spruts.eatnPraise(julio.cooking(20),julio, " because " + spruts.getName() + " ate " + julio.cooking(20).toString()+ " very far ");
        spruts.realising(julio, Places.HOME);
    }
}