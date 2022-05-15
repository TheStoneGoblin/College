/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4141
 */

public class Assignment2021Part1{
    public static void main (String[] args){
        String tweet;
        tweet = "God is dead. God remains dead. "   +
        "And we have killed him. "                  +
        "How shall we comfort ourselves, "          +
        "the murderers of all murderers? "          +
        "#Philosophy #Nietzsche";
        /* 
        tweet = 
        "God is dead. God remains dead."    +
        "And we have killed him."           +
        "How shall we comfort ourselves,"   +
        "the murderers of all murderers?"   +
        "#Philosophy #Nietzsche";
         */

        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000;
        final long SECONDS_IN_AN_HOUR = 60*60;
        long millisSinceMidnight = 0, secondsSinceMidnight = 0;
        long hour = 0, minute = 0, second = 0;
        long displayHour;

        millisSinceMidnight = System.currentTimeMillis() % MILLISECONDS_IN_A_DAY;
        secondsSinceMidnight = millisSinceMidnight / 1000;
        hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) /60;
        second = secondsSinceMidnight % 60;

        System.out.println("******************************");
        System.out.println("Tweet Analysis");
        System.out.println("==============");
        System.out.print("Posted at ");
        if(hour < 10){
            System.out.print(0);
        }
        System.out.print(hour + ":");
        if(minute < 10){
            System.out.print(0);
        }
        System.out.print(minute + ":");
        if(second < 10){
            System.out.print(0);
        }
        System.out.println(second);
        System.out.println("Posted by " + "@" + System.getProperty("user.name"));
        System.out.println("Text tweet is " + "'" + tweet + "'");
        System.out.println("Tweet Length is " + (tweet.length()));
        int hash = (tweet.indexOf("#"));
        if(hash < 0){
            System.out.println("Tweet Contains NO HashTag(s)");
        }else{
            System.out.println("Tweet Contains HashTag(s)");
        }
        System.out.println("******************************");
    }
}