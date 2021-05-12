package at.la.cc.remote;

import at.la.cc.oop.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Batterie> batteries;
    private int[] channel = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void selectChannel(int channel) {
        System.out.println("Channel " + channel + " selected.");
        for (Batterie batterie : batteries) {
            batterie.powerConsumption(0.7);
        }
        if (getStatusOfBatteries() < 3.2)
            System.out.println("Attention! The level of the batteries is low");
    }

    public double getStatusOfBatteries() {
        double sum = (batteries.get(0).getLevel() + batteries.get(1).getLevel()) / 2;
        return sum;
    }

    public void addBatterie(Batterie batterie) {
        if (this.batteries.size() >= 2) {
            System.out.println("All places for batteries in the remonte are taken.");
            return;
        } else {
            this.batteries.add(batterie);
        }
    }

}
