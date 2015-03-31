/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg80striviagame.TriviaGame;
import triviagame.view.ViewInterface;

/**
 *
 * @author whitbillman
 */
public abstract class TotalTimeTest implements ViewInterface {
    private final String promptMessage;
    
    protected final BufferedReader keyboard = TriviaGame.getInFile();
    protected final PrintWriter console = TriviaGame.getOutFile();
    
    
    
    public TotalTimeTest(String promptMessage) {
        this.promptMessage = promptMessage;
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
