package at.la.cc.camera;

import java.util.stream.IntStream;

public class PhotoFileCamera {
    private String nameOfFile;
    private String extensionOfFile;
    private String date;
    private int size;


    //region CONSTRUCTOR
    public PhotoFileCamera(String nameOfFile, String extensionOfFile, String date, int size) {
        this.nameOfFile = nameOfFile;
        this.extensionOfFile = extensionOfFile;
        this.date = date;
        this.size = size;
    }
    //endregion

    public String getInfo(){
        //gibt  die Metadaten des Files als String gesamt zurück
        return getNameOfFile() + getExtensionOfFile() + " - Filesize is " + getSize() + " MB" ;
    }



    //region GETTER SETTER
    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public String getExtensionOfFile() {
        return extensionOfFile;
    }

    public void setExtensionOfFile(String extensionOfFile) {
        this.extensionOfFile = extensionOfFile;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    //endregion


    public String myToString() {
        return nameOfFile;
    }


    @Override
    public String toString() {
        return "PhotoFilesCamera{" +
                "nameOfFile='" + nameOfFile + '\'' +
                ", extensionOfFile='" + extensionOfFile + '\'' +
                ", date='" + date + '\'' +
                ", size=" + size +
                '}';
    }
}
