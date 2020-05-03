package Opg3Græs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitTheGrassTest {

    double calculateHittingGrass = 2.50;
    HitTheGrass x = new HitTheGrass();
    double actual = x.calculateHittingGrass(1.0, 3.0);

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void calculateHittingGrass() {
        assertEquals(calculateHittingGrass, actual,0);
    }
}