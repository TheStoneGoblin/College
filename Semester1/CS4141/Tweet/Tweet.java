/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4141
 */
public class Tweet{

    private String postedBy;
    private String tweetText;
    private int hashtagCount;
    private int usernameCount;
    private long postedAt = System.currentTimeMillis();

    private final int MINIMUM_DISPLAY_WIDTH = 1;
    private final int MAXIMUM_DISPLAY_WIDTH = 80;
    private final int MINIMUM_HEADER_WIDTH = 10;
    private final long MILLISECONDS_IN_A_DAY = 24*60*60*1000;
    private final long SECONDS_IN_AN_HOUR = 60*60;
    private final long millisSinceMidnight = postedAt % MILLISECONDS_IN_A_DAY;

    public Tweet(){
        postedBy = "@" + System.getProperty("user.name");

        tweetText = "@God is dead. @God remains dead. " +
        "And we have killed him. "                  +
        "How shall we comfort ourselves, "          +
        "the murderers of all murderers? "          +
        "#Philosophy #Nietzsche";

        hashtagCount = count('#');
        usernameCount = count('@');
    }

    public Tweet(String text){
        postedBy = "@" + System.getProperty("user.name");

        tweetText = text;

        hashtagCount = count('#');
        usernameCount = count('@');
    }

    private int count(char symbol){
        int count = 0;
        for(int i = 0; i < this.tweetText.length(); i++){
            if(tweetText.charAt(i) == symbol){
                count++;
            }
        }
        return count;
    }

    public String postedAtTime(){
        long secondsSinceMidnight = 0;
        long hour = 0, minute = 0, second = 0;
        long displayHour;

        secondsSinceMidnight = millisSinceMidnight / 1000;
        hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) /60;
        second = secondsSinceMidnight % 60;

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String getTweetText(){
        return tweetText;
    }

    public int getHashtagCount(){
        return hashtagCount;
    }

    public int getUserCount(){
        return usernameCount;
    }

    public long getPostedAt(){
        return postedAt;
    }

    public int timeInSeconds(){
        int seconds = (int) ((postedAt % MILLISECONDS_IN_A_DAY) / 1000);
        return seconds;
    }

    public int timeInSeconds(int hour, int minute, int second){
        if(hour < 0 || hour > 23){
            return -1;
        }
        if(minute < 0 || minute >59){
            return -1;
        }
        if(second < 0 || second > 59){
            return -1;
        }
        return (hour*60*60 + minute*60 + second);
    }

    public char activtyIndicator(){
        long secondsSinceMidnight = millisSinceMidnight / 1000;
        int hour = (int) (secondsSinceMidnight / SECONDS_IN_AN_HOUR);
        int act = hour;
        if(hour >= 22 || hour < 6){
            return 'N';
        }else if(hour >= 6 && hour < 12){
            return 'M';        
        }else if(hour >= 12 && hour < 17){
            return 'A';
        }else{
            return 'E';
        }
    }

    public boolean containsWord(String aWord){
        
        boolean c = true;
        String[] splitStr = tweetText.split(" ");
        for(String a: splitStr){
            if(a.equals(aWord)){
                c = true;
                break;
            }
            c = false;
        }
        return c;
    }

    public void display(int width, boolean includeHeader){

        int width1 = 0;
        if(width == 0){
        }else if(width < MINIMUM_HEADER_WIDTH){
            width1  = MINIMUM_HEADER_WIDTH;
        }else if(width > MAXIMUM_DISPLAY_WIDTH){
            width1 = MAXIMUM_DISPLAY_WIDTH;
            width = MAXIMUM_DISPLAY_WIDTH;
        }else{
            width1 = width;
        }
        int tens = width1 / 10;
        int units = width1 - tens * 10;
        int i;
        String numbers = "1234567890";
        String line = "================================================================================";
        if(includeHeader == true){
            for(i = 1; i <= tens; i = i + 1){
                System.out.printf("%10d",i);
            }
            System.out.println();
            for(i = 0; i < tens; i = i + 1){
                System.out.print(numbers);
            }
            if(units > 0){
                System.out.print(numbers.substring(0,units));
            }
            System.out.println();
            System.out.println(line.substring(0,width1));
        }   

        //c goes up to 14 for a max 280 char tweet but it can be set higher

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
}