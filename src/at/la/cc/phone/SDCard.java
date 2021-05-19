package at.la.cc.phone;

import at.la.cc.oop.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> phoneFiles;
    private Camera camera;


    //region CONSTRUCTOR
    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
        this.camera = camera;
    }
    //endregion

    //region METHODEN
    public void safePicture(PhoneFile phoneFile){
        //wenn capacity frei ist und das phoneFile kleiner als die freie Größe ist, dann speichern
        phoneFiles.add(phoneFile);
        System.out.println(phoneFile);
    }

    public void getFreeSpace(){
        //wenn man auf dem Phone abfragt getFreeSpace dann geht er zur SDcard und ruft dir die MEthode in der SD Card auf für getFreeSpace
        //er holt sich alle Files und berechnet von denen die gesamte größe und zieht es von der capacity ab und das ist dann der noch freie platz auf der SDcard
    }

    public void getAllFiles(){
        //liefert alle Files zurück wenn man es auf dem Phone abfragt
    }



    //endregion

    //region GETTER SETTER
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }

    public void setPhoneFiles(List<PhoneFile> phoneFiles) {
        this.phoneFiles = phoneFiles;
    }


    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
//endregion
}
