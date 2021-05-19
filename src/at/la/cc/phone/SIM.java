package at.la.cc.phone;

public class SIM {
    private int ID;
    private String number;

    //region CONSTRUCTOR
    public SIM(int ID, String number) {
        this.ID = ID;
        this.number = number;
    }
    //endregion

    //region GETTER SETTER

    public int getID() {
        return ID;
    }

    public String getNumber() {
        return number;
    }

    //endregion
}
