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

    @Test
    public void test1(){
        String input="The cow jumped over the moon.";
        Assert.assertEquals("6 and jumped",longestWord(input));
    }
    @Test
    public void test2(){
        String input="";
        Assert.assertEquals("You do not have any word!",longestWord(input));
    }
    @Test
    public void test3(){
        String input="The animal jumped over the moon.";
        Assert.assertEquals("6 and animal",longestWord(input));
    }

}
