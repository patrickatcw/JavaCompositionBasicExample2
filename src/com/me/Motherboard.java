package com.me;
//step 1 making motherboard class
public class Motherboard {

    //step 2 fields
    private String model;
    private String manufacturer;
    private int ramslots;
    private int cardSlots;
    private String bios;

    //step 3 constructor
    public Motherboard(String model, String manufacturer, int ramslots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramslots = ramslots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    //step 4 method
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

    //step 3 getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}

//step 5 create monitor class



