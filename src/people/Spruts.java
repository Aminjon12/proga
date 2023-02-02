package people;
import utils.*;
import utils.places.Places;
import Others.*;
import java.util.Objects;

public class Spruts extends Human implements toDinner {
    private boolean isHeAlive=true;

    private final String name;
    private Boolean canCook;
    private Boolean isAgree;
    private Places whereIsS;

    public Spruts(String name, boolean canCook, boolean isAgree, boolean isHeAlive) {
        this.canCook = canCook;
        this.isAgree = isAgree;
        this.name = name;
        this.isHeAlive=isHeAlive;
    }

    public boolean isHeAlive() {
        return isHeAlive;
    }

    public void setHeAlive(boolean heAlive) {
        isHeAlive = heAlive;
    }

    public Places getWhereIsS() {
        return whereIsS;
    }

    public void setWhereIsS(Places place) {
        whereIsS = place;
    }

    public void invited(Julio julio, Places place) {
        julio.setWhereIsJ(place);
        System.out.println("After inviting " + julio.getName() + " to " + place.getPlace());
    }

    public void going(Places place, Julio julio) {
        julio.setWhereIsJ(place);
        whereIsS = place;
        System.out.println("Going with " + julio.getName() + " to the " + place.getPlace());
    }

    public void breaksAndFires(Obj obj, int amount, String why, Obj obj2) {
        class Wood {
            private boolean isBroken;

            Wood(boolean isBroken) {
                this.isBroken = isBroken;
            }

            public boolean isBroken() {
                return isBroken;
            }

            public void setBroken(boolean broken) {
                isBroken = broken;
            }
        }
        Wood wood = new Wood(true);
        obj.setBroken(true);
        obj2.setOnFire(true);
        if (obj.isBroken()) {
            System.out.println(name + " breaks " + amount + " " + obj.getObj() + " and " + why + " " + obj2.getObj());
        }
    }

    Pants pants = new Pants();

    public void shaterringAndReliesing(Ingridients ingridient, Obj did, Obj neededTo) {

        if (!canCook) {
            System.out.println("then shattered the " + ingridient.EGG.getIng() + " but instead of reliesing " + ingridient.EGG.getIng() + " into " + neededTo.getObj() + " " + name + " reliesed " + ingridient.EGG.getIng() + " on " + did.getObj());
            pants.setDirty(true);
        } else {
            System.out.println(name + " fried an " + ingridient.EGG.getIng() + " on a " + neededTo.getObj());
            pants.setDirty(false);
        }
    }

    public void deciding(String decision) {
        System.out.println("if things go on like this " + decision);
    }

    public void eatnPraise(CookedEgg cookedEgg, Julio julio, String why) {
        System.out.println(name + " ate " + cookedEgg.toString() + " and praised " + julio.getName() + why);

    }

    public void realising(Julio julio, Places place) {
        if (!canCook) {
            if (julio.getCanCook()) {
                System.out.println(name + " invited " + julio.getName() + " to his " + place.HOME.getPlace());
                if (julio.getAgree() & isAgree) {
                    System.out.println("NORMAL LIFE OF " + name + " GUARANTEED ");
                } else {
                    System.out.println(name + " dead");
                }
            } else {
                System.out.println(name + " doesn't need " + julio.getName());
            }
        } else {
            System.out.println(name + " can cook by himself");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void setAgree(Boolean agree) {
        isAgree = agree;
    }

    public void setCanCook(Boolean canCook) {
        this.canCook = canCook;
    }

    @Override
    public void toDinner(Julio julio, Spruts spruts) {
        System.out.println("and they started eating with" + julio.getName());
    }

    @Override
    public String toString() {
        if (canCook) {
            if (isAgree) {
                return "name { " + name + "} cancook {yes} is agree{yes}";
            } else {
                return "name { " + name + "} cancook {yes} is agree{no}";
            }
        } else {
            if (isAgree) {
                return "name { " + name + "} cancook {no} is agree{yes}";
            } else {
                return "name { " + name + "} cancook {no} is agree{no}";
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash() * 37 +
                Objects.hash(name) * 37 +
                Objects.hash(canCook) * 34 + Objects.hash(isAgree) * 23;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Spruts spruts = (Spruts) o;
        return name == spruts.name;
    }

    //local classes
    class Pants {
        protected boolean isDirty;

        public void setDirty(boolean dirty) {
            isDirty = dirty;
        }

        public String toString() {
            return "pants";
        }
    }
}
