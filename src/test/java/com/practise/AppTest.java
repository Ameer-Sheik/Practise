package com.practise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	App app = new App(); 
        assertEquals("check",app.checking());
    }
    
    @Test
    public void checkingSet() {
    	App app = new App();
    	app.setS("SAP");
    	assertEquals("SAP", app.getS());
    }
}
