package Others;
import java.util.Objects;
public class Obj {
    private String obj;
    private String size;
    private boolean isOnFire;
    private boolean isBroken;

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public boolean isOnFire() {
        return isOnFire;
    }

    public void setOnFire(boolean onFire) {
        isOnFire = onFire;
    }

    public Obj(String obj){
        this.obj=obj;
    }
    public Obj(String obj, String size){
        this.obj=obj;
        this.size=size;
    }
    public String getObj(){
        return obj;
    }
    @Override
    public int hashCode() {
        return Objects.hash() * 37 +
                Objects.hash(size) * 37;
    }

    public String getSize(){
        return size;
    }
    public String toString(){
        return size + " " + obj;
    }
}
