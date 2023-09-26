package org.guneetsingh;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Attribute.*;


public class Constants {


    static Attribute getColor(String str){
        switch(str){
            case "Red":
                return RED_TEXT();
            case "Green":
                return GREEN_TEXT();
            case "Yellow":
                return YELLOW_TEXT();
            case "Blue":
                return BLUE_TEXT();
            case "Magenta":
                return MAGENTA_TEXT();
            case "Violet":
                return TEXT_COLOR(127, 0, 255);
            case "Orange":
                return TEXT_COLOR(255, 165, 0);
            case "Grey":
                return TEXT_COLOR(128, 128, 128);
            case "Aqua":
                return TEXT_COLOR(0, 255, 255);
            case "Pink":
                return TEXT_COLOR(255, 192, 203);
            default:
                return WHITE_TEXT();
        }
    }
}
