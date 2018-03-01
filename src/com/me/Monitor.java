package com.me;
//step 5 creating this class

public class Monitor {

    //step 6 fields
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;//composition, resolution class is part of the monitor class

    //step 7 constructor
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    //step 9 method
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y +
                " in color " + color);
    }

    //step 8 getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}

//step 10 is to make Resolution class
//check to make sure error of Resolution goes away
