package at.la.cc.musiker;

public class BackgroundSinger extends Musicans{
    public BackgroundSinger(String name, int alter, Band band) {
        super(name, alter, band);
    }

    @Override
    public void musizieren() {
        System.out.println("laaaaaaaaaaaaa");
        //super.musizieren();
    }
}
