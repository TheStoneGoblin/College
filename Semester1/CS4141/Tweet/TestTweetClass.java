/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4141
 */
public class TestTweetClass{
    public static void main(String[] args){

        int display = (int) (Math.random() * 91);
        boolean header = Math.random() < 0.5;

        Tweet newTweet = new Tweet(TextOfTweet());
        
        System.out.println("BEGIN===========BEGIN \n");
        
        System.out.println("some random times in seconds:");
        System.out.println("10:20:30 " + newTweet.timeInSeconds(10, 20, 30));
        System.out.println("14:45:22 " + newTweet.timeInSeconds(14, 45, 22));
        System.out.println("25:20:30 " + newTweet.timeInSeconds(25, 20, 30));
        System.out.println("10:80:30 " + newTweet.timeInSeconds(10, 80, 30));
        System.out.println("10:20:90 " + newTweet.timeInSeconds(10, 20, 90));
        System.out.println("25:80:90 " + newTweet.timeInSeconds(25, 80, 90) + "\n");
        

        System.out.println("unformated text = " + newTweet.getTweetText() + "\n");
        newTweet.display(display,header);

        System.out.println(newTweet.getHashtagCount() + "#");
        System.out.println(newTweet.getUserCount() + "@" + "\n");

        System.out.println(newTweet.postedAtTime());
        System.out.println("Millis since the begining of time : " + newTweet.getPostedAt());
        System.out.println("Time in seconds : " + newTweet.timeInSeconds());
        System.out.println("Active time : " + newTweet.activtyIndicator() + "\n");

        System.out.println("Does the word a exist in the text? : " + newTweet.containsWord("a"));
        System.out.println("Does the word programming exist in the text? : " + newTweet.containsWord("programming"));
        System.out.println("Does the word I exist in the text? : " + newTweet.containsWord("I"));
        System.out.println("Does the word is exist in the text? : " + newTweet.containsWord("is"));
        System.out.println("Does the word bastard exist in the text? : " + newTweet.containsWord("bastard"));
        System.out.println("Does the word it exist in the text? : " + newTweet.containsWord("it"));
        System.out.println("Does the word with exist in the text? : " + newTweet.containsWord("with") + "\n");

        System.out.println("END===========END \n");
    }

    private static String TextOfTweet(){
        
        String text = "";
        int randomSelection = (int) (Math.random() * 9);
        if(randomSelection == 0) {

            text = "Simplicity is a great virtue but it requires hard work to achieve it " +
            "and education to appreciate it.";

        } else if(randomSelection == 1) {

            text = "The question of whether #MachinesCanThink is " +
            "is about as relevant as the question of whether #SubmarinesCanSwim.";

        } else if(randomSelection == 2) {

            text = "@CS4141Students @CS6371Students " +
            "The art of programming is the art of organizing complexity, " +
            "of mastering multitude and avoiding its bastard chaos as " +
            "effectively as possible." ;

        } else if(randomSelection == 3) { 

            text = "The competent programmer is fully aware of the strictly limited " +
            "size of his own #skull; therefore he approaches the programming " +
            "task in full #humility, and among other things he avoids clever " +
            "tricks like the plague. @SmartProgrammers" ;

        } else if(randomSelection == 4) {

            text = "In 1957 I married and Dutch marriage rites require you to state " +
            "your profession and I stated that I was a #programmer. But the " +
            "municipal authorities of the town of @Amsterdam did not accept it " +
            "on the grounds that there was no such profession." ;

        } else if(randomSelection == 5) {

            text = "How do we convince @people that in programming #simplicity and #clarity " +
            "— in short: what mathematicians call \"elegance\" — are not a dispensable " +
            "luxury, but a crucial matter that decides between success and failure?" ;

        } else if(randomSelection == 6) {  

            text = "Automatic computers have now been with us for a quarter of a century. " +
            "They have had a great impact on our @society in their capacity of #tools, " +
            "but in that capacity their influence will be but a ripple on the surface " +
            "of our culture, compared with the much more profound influence they will " +
            "have in their capacity of #intellectual #challenge without precedent in the " +
            "cultural history of @mankind." ;  

        } else if(randomSelection == 7) {  

            text = "A picture may be worth a thousand words, but a formula is worth a thousand " +
            "pictures.";

        } else if(randomSelection == 8){

            text = "God is dead. God remains dead. "   +
            "And we have killed him. "                  +
            "How shall we comfort ourselves, "          +
            "the murderers of all murderers? "          +
            "#Philosophy #Nietzsche";

        }
        return text;
    }
}