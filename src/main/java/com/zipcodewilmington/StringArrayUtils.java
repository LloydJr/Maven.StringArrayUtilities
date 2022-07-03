package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (value == s) {
                return true;
            }
        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] flip = array;
        Collections.reverse(Arrays.asList(array));
        return flip;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseTheArray = new String[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            reverseTheArray[count] = array[i];
            count++;
        } if (array != reverseTheArray){
            return true;
        }else {
            return Arrays.equals(array, reverseTheArray);
        }
//        if (Arrays.equals(array, StringArrayUtils.reverse(array))) {
//            return true;
//        }
//        return false;

//        "I was not able to pass the third test with either methods to do it..."
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String string = "";
        boolean[] theAlphabt = new boolean[26];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            string += array[i];
        }
        string = string.replace(" ","");
        for (int i = 0; i < array.length; i++){
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                index = string.charAt(i)- 'A';
                theAlphabt[index]= true;
            }
        }
        for(int i = 0; i < 26 ; i++){
            if (!theAlphabt[i]){
                return true;
            }
        }

        return false;
    }
//    "Failed one test..."

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter= 0;
        for( int i = 0; i < array.length; i++) {
            if (array[i].equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> remove = new ArrayList<String>();
//        Imported Array List
        for (int i = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                remove.add(array[i]);
            }
        }
        return remove.toArray(new String[remove.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> remove = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if(array.length - 1 == i){
            remove.add(array[i]);
        } else if (!array[i].equals(array[i + 1])) {
                remove.add(array[i]);
            }
        }
            return remove.toArray( new String[remove.size()]);

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> pack = new ArrayList<String>();
        pack.add(array[0]);
        int count = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i].equals(Character.toString(pack.get(count).charAt(0)))) {
                String consecutive = pack.get(count) + array[i];
                pack.set(count, consecutive);
            } else {
                pack.add(array[i]);
                count++;
            }
        }
        return pack.toArray(new String[pack.size()]);
    }


}
