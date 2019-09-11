import org.junit.Assert;
import org.junit.Test;

public class LongestWordTest {

    //will test if there is only one longest word
    @Test
    public void test1(){
        String input="The cow jumped over the moon.";
        Assert.assertEquals("6 and jumped",LongestWord.longestWord(input));
    }
    //will test if there is no word
    @Test
    public void test2(){
        String input="";
        Assert.assertEquals("You do not have any word!",LongestWord.longestWord(input));
    }
    //will test if there are more than 1 longest word
    @Test
    public void test3(){
        String input="The animal jumped over the moon.";
        Assert.assertEquals("6 and animal, jumped",LongestWord.longestWord(input));
    }
}
