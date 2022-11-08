package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void initializeTest(){
        Player player1 = new Player("p1", 1234);

        assertEquals("p1", player1.getUsername());
        assertEquals(1234,player1.getID());
    }

    @Test
    public void scoreTest(){
        Player playerScoreTest = new Player("test", 1111);

        assertEquals(0, playerScoreTest.getScore());

        playerScoreTest.increaseScore();

        assertEquals(1, playerScoreTest.getScore());
    }
}