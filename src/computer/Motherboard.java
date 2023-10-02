package computer;

import java.util.Arrays;

public class Motherboard {
    private String name;
    private int ramSlots;
    private int ramInSlots = 0;
    private int[] Ram = new int[ramSlots];

    Motherboard() {

    }

    Motherboard(String name, int ramSlots, int... RAM) {
        setName(name);
        setRamSlots(ramSlots);
        for (int a : RAM) {
            this.Ram = RAM;
            ramInSlots++;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getTotalRam() {
        int totalRam = 0;
        for (int i : Ram) {
            totalRam += i;
        }
        return totalRam;
    }

    @Override
    public String toString() {
        return "Motherboard: " + name + "\n" +
                "\tRAM (x " + ramInSlots + "/" + ramSlots + ")" +
                " size: " + (getTotalRam() * 1024) + " MB " + "\n";
    }

}
