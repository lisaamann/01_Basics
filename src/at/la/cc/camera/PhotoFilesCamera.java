package at.la.cc.camera;

public class PhotoFilesCamera {
    public enum SIZE {LARGE, MIDDLE, SMALL};//2GB, 4GB, 6 GB
    private String nameOfFile;
    private String extensionOfFile;
    private String date;
    private PhotoFilesCamera.SIZE size;

    //region CONSTRUCTOR
    public PhotoFilesCamera(String nameOfFile, String extensionOfFile, String date, SIZE size) {
        this.nameOfFile = nameOfFile;
        this.extensionOfFile = extensionOfFile;
        this.date = date;
        this.size = size;
    }
    //endregion


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
    //endregion
}
