/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4141
 */

public class Assignment2021Part2{
    public static void main (String[] args){

        String tweet = "";
        //tweet selection
        int randomSelection = (int) (Math.random() * 9);
        if(randomSelection == 0) {

            tweet = "Simplicity is a great virtue but it requires hard work to achieve it " +
            "and education to appreciate it.";

        } else if(randomSelection == 1) {

            tweet = "The question of whether #MachinesCanThink is " +
            "is about as relevant as the question of whether #SubmarinesCanSwim.";

        } else if(randomSelection == 2) {

            tweet = "@CS4141Students @CS6371Students " +

            "The art of programming is the art of organizing complexity, " +
            "of mastering multitude and avoiding its bastard chaos as " +
            "effectively as possible." ;

        } else if(randomSelection == 3) { 

            tweet = "The competent programmer is fully aware of the strictly limited " +
            "size of his own #skull; therefore he approaches the programming " +
            "task in full #humility, and among other things he avoids clever " +
            "tricks like the plague. @SmartProgrammers" ;

        } else if(randomSelection == 4) {

            tweet = "In 1957 I married and Dutch marriage rites require you to state " +
            "your profession and I stated that I was a #programmer. But the " +
            "municipal authorities of the town of @Amsterdam did not accept it " +
            "on the grounds that there was no such profession." ;

        } else if(randomSelection == 5) {

            tweet = "How do we convince @people that in programming #simplicity and #clarity " +
            "— in short: what mathematicians call \"elegance\" — are not a dispensable " +
            "luxury, but a crucial matter that decides between success and failure?" ;

        } else if(randomSelection == 6) {  

            tweet = "Automatic computers have now been with us for a quarter of a century. " +
            "They have had a great impact on our @society in their capacity of #tools, " +
            "but in that capacity their influence will be but a ripple on the surface " +
            "of our culture, compared with the much more profound influence they will " +
            "have in their capacity of #intellectual #challenge without precedent in the " +
            "cultural history of @mankind." ;  

        } else if(randomSelection == 7) {  

            tweet = "A picture may be worth a thousand words, but a formula is worth a thousand " +
            "pictures.";

        } else if(randomSelection == 8){

            tweet = "God is dead. God remains dead. "   +
            "And we have killed him. "                  +
            "How shall we comfort ourselves, "          +
            "the murderers of all murderers? "          +
            "#Philosophy #Nietzsche";

        }

        //clock display
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
        System.out.println("Tweet Text (unformatted) : " + tweet + "\n");
        
        // 30 or 20 char display
        int d;
        //d = 20;
        d = 30;
        System.out.println("Tweet Text as a series of up to "+ d +" character segments \n");

        int a = 30;
        int b = 0;
        int c = 0;
        for(c = c; c < 14; c++){
            if(tweet.length() > a){
                System.out.println(tweet.substring(b,a));
                a = a + d;
                b = b + d;
            }else{
                System.out.println(tweet.substring(b, tweet.length()) +"\n");
                break;
            }
        }

        //count #
        char hash = '#';
        int count = 0;
        for(int i = 0; i < tweet.length(); i++){
            if(tweet.charAt(i) == hash){
                count++;
            }
        }
        System.out.printf("0%d%s%n",count, " Hashtags");

        //count @
        char name = '@';
        int count1 = 0;
        for(int j = 0; j < tweet.length(); j++){
            if(tweet.charAt(j) == name){
                count1++;
            }
        }
        System.out.printf("0%d%s%n",count1, " Usernames");
        
        System.out.println("******************************");
    }
}
