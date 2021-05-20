package at.la.cc.phone;

import java.util.Scanner;

public class Phone {
    private String colore;
    private Login login;
    private boolean isLoggedIn = false;
    private SIM sim;
    private SDCard sdCard;
    private PhoneFile phoneFile;
    private Camera camera = new Camera(100);


    //region CONSTRUCTOR
    public Phone(SIM sim, SDCard sdCard, String colore) {
        this.colore = colore;
        this.login = new Login();
        this.sim = sim;
        this.sdCard = sdCard;
        camera.setSdCard(this.sdCard);
    }
    //endregion

    //region METHODEN
    public void sayHello() {
        if (isLoggedIn) {
            System.out.println("Hello you");
        } else {
            System.out.println("Please Sign in");
        }
    }

    public void doLogin() {
        if (login.checkLogin()) {
            System.out.println("Login successful");
            isLoggedIn = true;
        } else {
            System.out.println("Wrong insert.");
        }
    }

    public void makeCall(){
        Scanner input2 = new Scanner(System.in);
        //mit der SIM Card deren Nummer einen anrufe machen
        if (sim==null){
            System.out.println("no SIM available. Can't do call without SIM.");
        }if (sim!=null){
            System.out.println("Bitte Nummer eingeben");
            int nummer = input2.nextInt();
            System.out.println("Nummer: " + sim.getNumber() + " ruft " + nummer + " an.");
        }
    }

    public void getFreeSpace(){
        //wenn man auf dem Phone abfragt getFreeSpace dann geht er zur SDcard und ruft dort die MEthode in der SD Card auf für getFreeSpace
        sdCard.getFreeSpace();
    }

    public void printAllFile(){
        //hier geht das Phone her zu seiner SDcard und sagt gibt mir alle deine files und printet die dann in der console aus
        System.out.println(sdCard.getAllFiles());
    }

    public void takePicture() {
        Scanner input = new Scanner(System.in);
            System.out.println("wanna take some photos?");
            String eingabe = input.nextLine();
            if (eingabe.equals("yes")) {
                //wenn ich diese methode aufrufe dann geht das phone zu camera und sagt du mach mir ein picture
                //die methode makePicture in der camera macht das bild und liefert das neue Phonefile dann zurück
                //dann muss dass neue phonefile vom phone aus auf die SDcard gespeichert werden
            camera.makePicture();
            }
            if (eingabe.equals("no")) {
                System.out.println("Okay.");
            }
    }
    //endregion


    //region GETTER SETTER
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public PhoneFile getPhoneFile() {
        return phoneFile;
    }

    public void setPhoneFile(PhoneFile phoneFile) {
        this.phoneFile = phoneFile;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
//endregion
}
