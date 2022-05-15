/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4222
*/

import java.io.*;
import java.util.*;
public class Dictionary{
    private ArrayList<String> list;
    private int shortest;
    private int longest;
    public Dictionary(String filepath, int shortest, int longest){
        this.list = new ArrayList<>();
        this.shortest = shortest;
        this.longest = longest;
        try{
            File file = new File(filepath);
            Scanner dataSource = new Scanner(file);

            while(dataSource.hasNext()){
                String line = dataSource.nextLine();
                String[] split = line.split(",");

                for(String word: split){
                    word = word.trim().toUpperCase();
                    if(word.length() >= this.shortest && word.length() <= this.longest){
                        if(!this.list.contains(word)){
                            this.list.add(word);
                        }
                    }
                }
            }
            Collections.sort(this.list);
        }catch (IOException e){
            System.out.println("ERROR: File not found");
        }
    }

    public boolean add(String word){
        boolean found = false;
        word = word.trim().toUpperCase();
        if(word.length() >= this.shortest && word.length() <= this.longest){
            if(!this.list.contains(word)){
                this.list.add(word);
                Collections.sort(this.list);
                found = true;
            }
        }
        return found;
    }

    public String nextWord(){
        String nextWord = "";
        
        if(this.list.size() > 0){
            int pos = (int) (Math.random() * list.size());
            nextWord = list.get(pos);
        }
        return nextWord;
    }
    
    public boolean inDictionary(String word){
        String word_new = word.trim().toUpperCase();
        return this.list.contains(word_new);
    }
}