package com.bridgelabz.analyser;

public class MoodAnalyser {
    String message;
    MoodAnalyser(){}

    String analyseMood(String message){
        String stringArray[] = message.split(" ");
        String result = " ";
        try {
            for (String var : stringArray) {
                if (var.equalsIgnoreCase("happy")) {
                    result = "Happy";
                    break;

                } else if (var.equalsIgnoreCase("sad")) {
                    result = "Sad";
                    break;
                }
            }
        }catch (NullPointerException e){
            result = "Happy" ;
        }
        if(result.equals(" ")){
            result = "Happy" ;
        }
        return result;
    }

}
class AnalyserMoodDemo{
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am Happy boy");
        System.out.println(mood);
    }
}


