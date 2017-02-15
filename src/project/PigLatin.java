package project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {


    public PigLatin(){}


    public String translate(String word){
        String translatedWord = "";
        Pattern firstVowelPattern = Pattern.compile("^([aeiouAEIOU].*)$");
        Pattern firstTwoConsonantsPattern = Pattern.compile("^([^aeiouAEIOU]{2})(.*)$");
        Pattern firstConsonantSecondVowelPattern = Pattern.compile("^([^aeiouAEIOU])([AEIOUaeiou].*)$");
        Matcher firstVowelMatcher = firstVowelPattern.matcher(word);
        Matcher firstTwoConsonantsMatcher = firstTwoConsonantsPattern.matcher(word);
        Matcher firstConsonantSecondVowelMatcher = firstConsonantSecondVowelPattern.matcher(word);

        if(firstVowelMatcher.find()){
            translatedWord = firstVowelMatcher.group(1) + "way";
        }

        if(firstTwoConsonantsMatcher.find()){
            translatedWord = firstTwoConsonantsMatcher.group(2) + firstTwoConsonantsMatcher.group(1) + "ay";
        }

        if(firstConsonantSecondVowelMatcher.find()){
            translatedWord = firstConsonantSecondVowelMatcher.group(2) + firstConsonantSecondVowelMatcher.group(1) + "ay";
        }
        return translatedWord;
    }
}