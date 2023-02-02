package exceptions;

public class EggAmountException extends Exception{
    public String toString(){
        return "amount can't be negative";
    }
}
