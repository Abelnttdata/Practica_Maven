package com.nttdata;


import org.junit.Assert;
import org.junit.Test;

public class TestAppUno {


    @Test
    public void testPrintHelloWorld() {

        Assert.assertEquals(App.getHelloWorld(), "Hello World");
    }
}
