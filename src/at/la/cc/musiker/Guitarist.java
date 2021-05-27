package at.la.cc.musiker;

public class Guitarist extends Musicans{
    public Guitarist(String name, int alter, Band band) {
        super(name, alter, band);
    }

    @Override
    public void musizieren() {
        System.out.println("di-di-diiidiiiii");
        //super.musizieren();
    }
}
