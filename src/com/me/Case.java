package com.me;
//step 14 make this class
public class Case {

    //step 15 fields
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;//creates another object that is part of case

    //step 16 constructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    //step 18 method
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    //step 17 getter
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

//step 19 create dimensions class
//error here for dimension, should go away once
//code completed in dimensions class
