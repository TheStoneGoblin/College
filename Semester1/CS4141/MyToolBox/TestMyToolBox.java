/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4141
 */
public class TestMyToolBox {
    public static void main(String[] args) {

        // initialise currentTime to the current time on the system clock

        String currentTime = MyToolBox.timeOfDay();

        // Display the time a Tweet was posted

        System.out.println("Posted at " + MyToolBox.timeOfDay());

        int i = 0, randomWidth = 0;
        // Display 10 random width headers
        for( i= 0; i < 10; i++) {
            randomWidth = (int) (Math.random() * 101); // random width 0...100
            MyToolBox.tweetHeader(randomWidth);
        }

        MyToolBox.displayTweet("Edsger Dijkstra", 4);

        String aTweet = "Bono saves but not in Ireland";

        MyToolBox.displayTweet(aTweet, 6);

        String anotherPost = "";

        MyToolBox.displayTweet(anotherPost, 25);

        String munsterRugby = "Munster 12 The All Blacks 0";

        MyToolBox.displayTweet(munsterRugby, 1978);

        String parnas = "We must not forget that the wheel is reinvented " +        
            "so often because it is a very good idea; " +
            "I've learned to worry more about the soundness " +
            "of ideas that were invented only once.";
        MyToolBox.analyse(parnas,35);

        int randomSelection = (int) (Math.random() * 9);
        String tweet = "";
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

        randomWidth = (int) (Math.random() * 81);
        MyToolBox.tweetHeader(randomWidth);
        MyToolBox.analyse(tweet,randomWidth);
    }
}