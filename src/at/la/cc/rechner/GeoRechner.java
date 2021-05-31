package at.la.cc.rechner;

public class GeoRechner {
    public double Kreisdurchmesser;
    public double Quadratlänge;
    public double Rechtecklänge;
    public double Rechteckbreite;

    //region CONSTRUCTOR
    public GeoRechner() {
    }
    //endregion

    //region METHODEN
    public double getKreisUmfang(double Umfang){
        this.Kreisdurchmesser = Kreisdurchmesser;
        Kreisdurchmesser = Kreisdurchmesser*3.14;
        return Kreisdurchmesser;
    }

    public double getRechteckUmfang(double Rechtecklänge, double Rechteckbreite){
        this.Rechtecklänge = Rechtecklänge;
        this.Rechteckbreite = Rechteckbreite;
        double Umfang = 10.0;
        Umfang = (Rechtecklänge * 2) + (Rechteckbreite * 2);
        return Umfang;
    }

    public double getQuadratUmfang(double Quadralaenge){
        this.Quadratlänge = Quadralaenge;
        double Umfang = 10.0;
        Umfang = Quadralaenge*4;
        return Umfang;
    }

    //endregion

    //region GETTER SETTER
    public double getKreisdurchmesser() {
        return Kreisdurchmesser;
    }

    public void setKreisdurchmesser(double kreisdurchmesser) {
        Kreisdurchmesser = kreisdurchmesser;
    }

    public double getQuadratlänge() {
        return Quadratlänge;
    }

    public void setQuadratlänge(double quadratlänge) {
        Quadratlänge = quadratlänge;
    }

    public double getRechtecklänge() {
        return Rechtecklänge;
    }

    public void setRechtecklänge(double rechtecklänge) {
        Rechtecklänge = rechtecklänge;
    }

    public double getRechteckbreite() {
        return Rechteckbreite;
    }

    public void setRechteckbreite(double rechteckbreite) {
        Rechteckbreite = rechteckbreite;
    }
    //endregion
}
