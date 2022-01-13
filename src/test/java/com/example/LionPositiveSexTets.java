package com.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionPositiveSexTets {

    private String sex;
    private boolean expectedResult;

    public LionPositiveSexTets(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getUserData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Feline feline;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.hasMane;
        boolean expected = expectedResult;
        assertEquals(expected, actual);
    }
}
