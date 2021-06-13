package lab.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
    	myString.setString("TURESDGDFG");
    	boolean result=true;
        assertEquals(result, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest2() {
    	myString.setString("Tewrertutyutyu");
    	boolean result=true;
        assertEquals(result, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest3() {
    	myString.setString("ewrertutyutyu");
    	boolean result=true;
        assertEquals(result, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest4() {
    	myString.setString("eRrertutyutyu");
    	boolean result=false;
        assertEquals(result, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest5() {
    	myString.setString("ewrertutyutyu123");
    	boolean result=false;
        assertEquals(result, myString.detectCapitalUse());
    }
}