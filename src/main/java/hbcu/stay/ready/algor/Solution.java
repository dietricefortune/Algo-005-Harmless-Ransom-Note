package hbcu.stay.ready.algor;

import sun.jvm.hotspot.utilities.Assert;

import java.util.HashMap;

public class Solution {

    public Boolean harmlessRansomNote(String message, String magazineText) {

            //String  = "";
            String[] note1 = message.split(" ");

            //initialize the hash map and call it ransom1
            HashMap<String, String> noteText = new HashMap<>();

            //if the ransom's VALUE does not return null, return false because something is repeated
            for (String str : note1) {
                if (noteText.get(str) != null) {
                    return false;

                //if not false, the return true, duh
                } else {

                    return true;

                }

            }
            return true;
        }



    }
