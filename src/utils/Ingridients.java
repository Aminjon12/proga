package utils;

public enum Ingridients {
    POTATOES("potatoes"),
    ONIONS("onions"),
    TURNIP("turnip"),
    EGG("egg"),
    DOUGH("dough");
    String what;
    Ingridients(String what){
        this.what=what;
    }
    public String getIng(){
        return what;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
