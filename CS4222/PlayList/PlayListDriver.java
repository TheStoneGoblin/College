/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4222
Date:   2022/03/18
*/
public class PlayListDriver{
    public static void main(String[] args) {
        PlayList musique = new PlayList("1");
        musique.add(new Track("Oh My My", "Summer Kennedy", 2018, (3*60) +42));
        musique.add(new Track("The Ruler Of Everything", "Tally Hall", 2003, (3*60) + 43));
        musique.add(new Track("She Is Beautiful", "Andrew W.K.", 2001, (3*60) + 33));
        musique.add(new Track("Problème d'émotion", "Igorrr", 2017, (4*60) + 38));
        musique.add(new Track("In Hell I'll Be In Good Company", "The Dead South", 2014, (4*60) + 9));
        musique.add(new Track("Takyon", "Death Grips", 2011, (3*60) + 34));

        System.out.println(musique.getName());
        musique.setName("musique");
        musique.showList();
        musique.add("Out Of Touch", "Hall & Oates" , 1984, (4*60) + 9);
        musique.add("Space Song", "Beach House", 2015, (5*60) + 20);
        musique.showList();

        musique.playAll(false);
        musique.playAll(true);

        musique.playOnly("summer");
        System.out.println("");
        musique.playOnly(1984);
        System.out.println("");

        musique.remove("song");
        musique.showList();
        
        musique.remove("Bad music");
        musique.showList();
    }
}