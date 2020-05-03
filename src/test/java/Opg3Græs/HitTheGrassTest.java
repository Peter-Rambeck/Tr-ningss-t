package Opg3Græs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitTheGrassTest {


    HitTheGrass x = new HitTheGrass();



    @Before
    public void setUp() throws Exception {

        HitTheGrass x = new HitTheGrass();

    }

    @Test
    public void calculateHittingGrass() {
        double actual = x.calculateHittingGrass(1.0, 3.0);
        double expected = 2.50;
        assertEquals(expected, actual);
    }
}