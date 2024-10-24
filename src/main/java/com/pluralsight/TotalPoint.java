package com.pluralsight;
public class TotalPoint{
public static void points(String[] games) {
    int gameScore = 0;

    for (String game : games) {
        String[] scores = game.split(":");
        int x = Integer.parseInt(scores[0]);
        int y = Integer.parseInt(scores[1]);
        if (x>y){
            gameScore += 3;
        } else if (x==y){
            gameScore += 1;
        }
    }

}
}