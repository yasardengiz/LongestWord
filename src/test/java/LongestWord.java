import org.junit.Assert;
import org.junit.Test;

public class LongestWord {
    public static String  longestWord(String sentence){
        int length=sentence.length();
        String longest="";
        if(length==0) return "You do not have any word!";
        else{
            String [] words=sentence.split(" ");
            int max=words[0].length();
            int indexMax=0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > max) {
                    max = words[i].length();
                    indexMax=i;
                }
            }
            longest=max+" and "+ words[indexMax];
        }
        return longest;
    }



}
