package com.sparta.ja;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("check that 5 == 5")
    void simpleTest(){
        Assertions.assertEquals(true, 5 == 5);
    }

    @Test
    @DisplayName("check message returned is Good Morning")
    void checkMessagedReturnedIsGoodMorning(){
        Assertions.assertEquals("Good Morning!", App.greeting(6));
    }

    @Test
    @DisplayName("check message returned is Good Afternoon")
    void checkMessageReturnedIsGoodAfternoon(){
        Assertions.assertEquals("Good Afternoon!", App.greeting(13));
    }

    @Test
    @DisplayName("check message returned is Good Evening")
    void checkMessageReturnedIsGoodEvening(){
        Assertions.assertEquals("Good Evening!", App.greeting(20));
    }

    @Test
    @DisplayName("check message returned is not a valid time -1")
    void checkMessageReturnedIsNotAValidTimeMinus1(){
        Assertions.assertEquals("Not a valid time of day", App.greeting(-1));
    }

    @Test
    @DisplayName("check message returned is not a valid time 25")
    void checkMessageReturnedIsNotAValidTime25(){
        Assertions.assertEquals("Not a valid time of day", App.greeting(25));
    }

    @Test
    @DisplayName("check crossover time 12 is afternoon")
    void checkCrossoverTime12isAfternoon(){
        Assertions.assertEquals("Good Afternoon!", App.greeting(12));
    }

    @Test
    @DisplayName("check crossover time 18 is afternoon")
    void checkCrossoverTime18isAfternoon(){
        Assertions.assertEquals("Good Afternoon!", App.greeting(18));
    }
}
