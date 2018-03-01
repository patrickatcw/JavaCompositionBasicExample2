package com.me;
/*
*****NOTE: composition is about having things, as opposed to being things;
creating objects within objects.
composition is most likely to be used before inheritance!!
no extends like in inheritance
*/
//example making a computer
//step 29
public class Main {

    public static void main(String[] args) {

        //step 28 instances
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,
                new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6,
                "v2.44");


        PC thePC = new PC (theCase, theMonitor, theMotherboard);
        thePC.powerUp();   //accessing PC.powerUp method, which is ref. case class presspowerbutton, then to PC drew logo
        //using the drawlogo method and the monitor class method drawpixelat does putout
        //removed b/c of changes in PC
      /*thePC.getMonitor().drawPixelAt(1500, 1200, "red");
      thePC.getMotherboard().loadProgram("Windows 1.0");
      thePC.getTheCase().pressPowerButton();*/

    }
}

//result;
/*
Power button pressed
Drawing pixel at 1200, 50 in color yellow
 */
