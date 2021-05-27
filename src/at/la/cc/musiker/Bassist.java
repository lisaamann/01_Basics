package at.la.cc.musiker;

public class Bassist extends Musicans{
    public Bassist(String name, int alter, Band band) {
        super(name, alter, band);
    }

    @Override
    public void musizieren() {
        System.out.println("dum-dum-duum");
        //super.musizieren();
    }
}
