package at.la.cc.rechner;

public class MWST_Rechner {
    public int mehrwertssteuer;
    public String Laenderkuerzel;
    public String Land;

    //region CONSTRUCTOR
    public MWST_Rechner(int mehrwertssteuer, String laenderkuerzel, String land) {
        this.mehrwertssteuer = mehrwertssteuer;
        Laenderkuerzel = laenderkuerzel;
        this.Land = Land;
    }
    //endregion

    //region METHODEN
    public void setLandByUserInput(){
        this.Land = Land;
        this.Laenderkuerzel = Laenderkuerzel;
        if (Laenderkuerzel.equals("CH")){
            setLand("Schweiz");
            setMehrwertssteuer(10);
        }
        if (Laenderkuerzel.equals("GB")){
            setLand("Großbritanien");
            setMehrwertssteuer(15);
        }
        if (Laenderkuerzel.equals("DE")){
            setLand("Deutschland");
            setMehrwertssteuer(19);
        }
    }

    //endregion


    //region GETTER SETTER
    public int getMehrwertssteuer() {
        return mehrwertssteuer;
    }

    public void setMehrwertssteuer(int mehrwertssteuer) {
        this.mehrwertssteuer = mehrwertssteuer;
    }

    public String getLaenderkuerzel() {
        return Laenderkuerzel;
    }

    public void setLaenderkuerzel(String laenderkuerzel) {
        Laenderkuerzel = laenderkuerzel;
    }

    public String getLand() {
        return Land;
    }

    public void setLand(String land) {
        Land = land;
    }
    //endregion
}
