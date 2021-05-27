package at.la.cc.musiker;

import java.util.ArrayList;
import java.util.List;

public class Band {
    private String nameOfTheBand;
    private ArrayList<Musicans> musicansList = new ArrayList<>();

    public Band(String nameOfTheBand) {
        this.nameOfTheBand = nameOfTheBand;
        this.musicansList = new ArrayList<>();
    }


    void addMusicansToBand(Singer singer, Guitarist guitarist, Bassist bassist, Trumpeter trumpeter, BackgroundSinger backgroundSinger) {
        musicansList.add(singer);
        musicansList.add(guitarist);
        musicansList.add(bassist);
        musicansList.add(trumpeter);
        musicansList.add(backgroundSinger);
    }

    public ArrayList<Musicans> getMembers() {
        for (int i = 0; i < musicansList.size(); i++) {
            System.out.println(musicansList.get(i).getName() + "" + musicansList.get(i).getName());
        }
        return musicansList;
    }

    //region GETTER SETTER
    public String getNameOfTheBand() {
        return nameOfTheBand;
    }

    public void setNameOfTheBand(String nameOfTheBand) {
        this.nameOfTheBand = nameOfTheBand;
    }

    public List<Musicans> getMusicansList() {
        return musicansList;
    }

    public void setMusicansList(ArrayList<Musicans> musicansList) {
        this.musicansList = musicansList;
    }

    //endregion
}
