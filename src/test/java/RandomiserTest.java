import models.Randomiser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomiserTest {
    private Randomiser randomiser;

    @Before
    public void setUp() throws Exception {
        randomiser = new Randomiser();
    }

//    @Test
//    public void canReturnRandomName() {
//        assertEquals("Angus", randomiser.shuffleNameListGetName());
//    }

//    @Test
//    public void canReturnArray(){
//        assertEquals("Whatever", randomiser.getTwoRandomNames());
//    }

}