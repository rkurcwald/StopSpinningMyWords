package com.github.rkurcwald;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SpinWordsTest 
{
    @Test
    public void test1() 
    {
      assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    }
    @Test
    public void test2()
    {
    	assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
    @Test
    public void test3()
    {
        assertEquals("Fast and suoiruF seires is nice", new SpinWords().spinWords("Fast and Furious series is nice"));
    }
    
}