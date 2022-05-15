/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4222
*/

public class DictionaryDriver{
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Wrong number of arguments");
        }else{
            Dictionary newDict = new Dictionary(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));

            String a = "flamingo";
            String c = "BrEAd      ";

            if(newDict.inDictionary(a)){
                System.out.printf("%s was found in file \n",a);
            }else{
                System.out.printf("%s was not found in file \n",a);
            }
            if(newDict.inDictionary(c)){
                System.out.printf("%s was found in file \n",c);
            }else{
                System.out.printf("%s was not found in file \n",c);
            }

            newDict.add(a);
            if(newDict.inDictionary(a)){
                System.out.printf("%s was found in file \n",a);
            }else{
                System.out.printf("%s was not found in file \n",a);
            }

            System.out.println();
            System.out.printf("random word from list: %s \n",newDict.nextWord());
            System.out.printf("random word from list: %s \n",newDict.nextWord());
            System.out.printf("random word from list: %s \n",newDict.nextWord());
            System.out.printf("random word from list: %s \n",newDict.nextWord());
        }
    }
}