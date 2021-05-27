package at.la.cc.musiker;

public class Musicans {
    private String name;
    private int alter;
    private Band band;

    public Musicans(String name, int alter, Band band) {
        this.name = name;
        this.alter = alter;
        this.band = band;
    }

    public void musizieren(){
        System.out.println("ich musiziere");
    }


    //region Getter Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
    //endregion
}
