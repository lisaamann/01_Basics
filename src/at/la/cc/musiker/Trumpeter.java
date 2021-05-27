package at.la.cc.musiker;

public class Trumpeter extends Musicans{
    public Trumpeter(String name, int alter, Band band) {
        super(name, alter, band);
    }

    @Override
    public void musizieren() {
        System.out.println("tut-tut-tuuuutituut");
        //super.musizieren();
    }
}
