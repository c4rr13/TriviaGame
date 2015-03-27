/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author whitbillman
 */
public class TotalTimeTest {
    
    public TotalTimeTest() {
    }

    /**
     * Test of TotalTime method, of class TotalTime.
     */
    @Test
    public void testTotalTime() {
        this.console.println("TotalTime");
        double CountryTime = 0.0;
        double PopTime = 0.0;
        double RockTime = 0.0;
        TotalTime instance = new TotalTime();
        double expResult = 0.0;
        double result = instance.TotalTime(CountryTime, PopTime, RockTime);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
