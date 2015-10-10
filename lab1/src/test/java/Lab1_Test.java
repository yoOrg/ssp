import org.junit.Assert;
import org.junit.Test;

/**
 * Created by duckyou on 10/10/15.
 */
public class Lab1_Test {

    @Test
    public void v11_Test(){

        Assert.assertEquals("Hello, little my pony!",new Lab1().v11("Hello, my little pony!"));
        Assert.assertEquals("ahahah Clock like 'sounds', tik-tak!",new Lab1().v11("Clock sounds like 'tik-tak', ahahah!"));
    }
}
