package sample;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void shouldCover2of3branches(){
        Hello hello = new Hello();
        Assert.assertEquals("hi",hello.customMessage(0));
        Assert.assertEquals("hello",hello.customMessage(1));
    }
}
