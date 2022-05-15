/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4141
 */
public class MyToolBox{
    public static String timeOfDay(){

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

        String hour1, minute1, second1;
        hour1 = String.valueOf(hour);
        minute1 = String.valueOf(minute);
        second1 = String.valueOf(second);

        if(hour < 10){
            hour1 = "0" + hour1;
        }
        if(minute < 10){
            minute1 = "0" + minute1;
        }
        if(second < 10){
            second1 = "0" + second1;
        }
        String time = hour1 + ":" + minute1 + ":" + second1;
        return time;
    }

    public static void tweetHeader(int width){
        if(width == 0){

        }else if(width < 10){
            width  = 10;
        }else if(width > 80){
            width = 80;
        }
        int tens = width / 10;
        int units = width - tens * 10;
        int i;
        String s = "1234567890";
        String a = "================================================================================";

        for(i = 1; i <= tens; i = i + 1){
            System.out.printf("%10d",i);
        }
        System.out.println();
        for(i = 0; i < tens; i = i + 1){
            System.out.print(s);
        }
        if(units > 0){
            System.out.print(s.substring(0,units));
        }
        System.out.println();
        System.out.println(a.substring(0,width));
    }

    public static void displayTweet(String tweetText, int width){
        int a = width;
        int b = 0;
        int c = 0;
        for(c = c; c < 14; c++){
            if(tweetText.length() > a){
                System.out.println(tweetText.substring(b,a));
                a = a + width;
                b = b + width;
            }else{
                System.out.println(tweetText.substring(b, tweetText.length()) +"\n");
                break;
            }
        }
    }

    public static int countOf(String tweetText, char symbol){
        int x;
        if(symbol == '#' ||  symbol == '@'){
            int count = 0;
            for(int i = 0; i < tweetText.length(); i++){
                if(tweetText.charAt(i) == symbol){
                    count++;
                }
            }
            return count;
        }else{
            return -1;
        }
    }

    public static void analyse(String tweetText, int width){
        MyToolBox.displayTweet(tweetText, width);
        int hash = MyToolBox.countOf(tweetText, '#');
        String hash1 = String.valueOf(hash);
        if(hash < 10){
            hash1 = "0" + hash1;
        }
        System.out.printf("%s Hashtag %n", hash1);

        int name = MyToolBox.countOf(tweetText, '@');
        String name1 = String.valueOf(name);
        if(name < 10){
            name1 = "0" + name1;
        }
        System.out.printf("%s Username %n", name1);
    }
}