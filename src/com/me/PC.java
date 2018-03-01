package com.me;
//step 23
public class PC {

    //step 24 fields
    private Case theCase;    //has these, which are fields called; the case, monitor, motherboard.
    private Monitor monitor;
    private Motherboard motherboard;

    //step 25 constructor
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //creating a method after making the below private
    //step 27
    public void powerUp(){
        //getTheCase().pressPowerButton();
        //after removing below, we change getTheCase to...
        theCase.pressPowerButton();
        drawLogo();
    }

    //step 28
    private void drawLogo(){
        //fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    //removed these and access our variables directly in power method above
    //step 26 getters
   /* private Case getTheCase() {  //changed from created public to private
        return theCase;
    }

    private Monitor getMonitor() {   //changed from created public to private
        return monitor;
    }

    private Motherboard getMotherboard() {   //changed from created public to private
        return motherboard;
    }*/
}

//step 29 go to main to run program

