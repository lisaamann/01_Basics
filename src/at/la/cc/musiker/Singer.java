package at.la.cc.musiker;

public class Singer extends Musicans {
    public Singer(String name, int alter, Band band) {
        super(name, alter, band);
    }

    @Override
    public void musizieren() {
        System.out.println("singe: lalalaa");
        //super.musizieren();
    }
}
