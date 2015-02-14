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
 * @author carri_000
 */
public class TotalScoreControlTest {
    
    public TotalScoreControlTest() {
    }

    /**
     * Test of TotalScore method, of class TotalScoreControl.
     */
    @Test
    public void testTotalScore() {
        System.out.println("TotalScore");
        SavedScore = null;
        Points <error>_2 = null;
        TotalScoreControl instance = new TotalScoreControl();
        double expResult = 0.0;
        double result = instance.TotalScore(<error>, <error>_2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
