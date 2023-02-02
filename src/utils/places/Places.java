package utils.places;

public enum Places {
    KITCHEN("kitchen"),
    HOME("home"),
    STORES("stores"),
    ROOM("room");
    String where;
    Places(String where){
        this.where = where;
    }
    public String getPlace(){
        return where;
    }

}
