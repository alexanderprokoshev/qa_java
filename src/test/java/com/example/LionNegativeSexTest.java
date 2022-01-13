package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionNegativeSexTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeTest() throws Exception  {
        expectedException.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion(feline, "Некорректный пол");
    }
}
