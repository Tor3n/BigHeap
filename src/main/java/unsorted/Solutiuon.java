package unsorted;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Solutiuon {
    public static void main(String[] args) throws Exception {
        //ArrayList<String> heh = splitDescription("СТАНДАРТ ииииииииииифывафываффыв");
        //System.out.println(heh.get(0));
        //System.out.println(heh.get(1));
        Double kek = 1.0d;
        kek = Double.NaN;
        System.out.println(kek);
    }

    private static ArrayList<String> splitDescription(String str) {
        ArrayList<String> descriptionArray = new ArrayList<String>();
        String currDesc = str.trim();
        if (currDesc.length()<30){
            descriptionArray.add(currDesc);
        } else {
            int lastSpacePosition = currDesc.lastIndexOf(" ", 30);
            if (lastSpacePosition == -1) {
                lastSpacePosition = currDesc.lastIndexOf(".", 30);
            }
            if (lastSpacePosition > 1) {
                descriptionArray.add(currDesc.substring(0, lastSpacePosition));
                if (currDesc.substring(lastSpacePosition).length() > 30) {
                    descriptionArray.addAll(splitDescription(currDesc.substring(lastSpacePosition)));
                } else {
                    descriptionArray.add(currDesc.substring(lastSpacePosition + 1));
                }
            }
        }

        return descriptionArray;
    }
}
