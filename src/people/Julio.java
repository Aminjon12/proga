package people;
import Others.*;
import utils.places.Places;
import utils.*;

import java.util.Objects;


public class Julio extends Human implements toDinner{
    private boolean isHeAlive;
    private String name;
    private Boolean isAgree;
    private Boolean canCook;
    private Places whereIsJ;

    public Places getWhereIsJ() {
        return whereIsJ;
    }
    public void setWhereIsJ(Places place){

        whereIsJ=place;
    }

    public Boolean getCanCook() {
        return canCook;
    }

    public Boolean getAgree() {
        return isAgree;
    }

    public Julio(String name, boolean canCook, boolean isAgree, boolean isHeAlive){
        this.name=name;
        this.canCook=canCook;
        this.isAgree=isAgree;
        this.isHeAlive=isHeAlive;
    }

    public boolean isHeAlive() {
        return isHeAlive;
    }

    public void setHeAlive(boolean heAlive) {
        isHeAlive = heAlive;
    }

    public void took(Ingridients[] ingridient){

        System.out.println(name + " took " + ingridient + " started doing by himself");
    }
    @Override
    public void toDinner(Julio julio, Spruts spruts) {
        System.out.println("and they started haveing " + EatnCook.DINNER.getEatingTime());
    }
    public CookedEgg cooking(int amount){
        CookedEgg.Eggs.masEggs(20);
        return new CookedEgg(amount);
    }
    public void choosingAndBuilding(Obj obj,int amount){
        System.out.println("choosing " + obj.toString() + name + " built a " + cooking(amount).toString() );
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }



    @Override
    public String toString(){
        if(canCook) {
            if (isAgree) {
                return "name { " + name +"} cancook {yes} is agree{yes}";
            } else{
                return "name { " + name +"} cancook {yes} is agree{no}";
            }
        } else {
            if(isAgree){
                return "name { " + name +"} cancook {no} is agree{yes}";
            } else{
                return "name { " + name +"} cancook {no} is agree{no}";
            }
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash() * 37 +
                Objects.hash(name) * 37 +
                Objects.hash(canCook)*34 + Objects.hash(isAgree)*23;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Julio julio = (Julio) o;
        return name == julio.name;
    }
}
