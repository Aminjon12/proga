package utils;

public enum EatnCook {
    BREAKFAST("breakfast"),
    LANCH("lanch"),
    DINNER("dinner");
    String eatingTime;
    EatnCook(String eatingTime){
        this.eatingTime = eatingTime;
    }

    public String getEatingTime() {
        return eatingTime;
    }
}
