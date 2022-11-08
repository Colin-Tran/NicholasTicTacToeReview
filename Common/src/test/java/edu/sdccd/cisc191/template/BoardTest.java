package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    @Test
    public void testBoardInit(){
        Player player1 = new Player("player1", 123);
        Player player2 = new Player("player2", 1234);
        Board newBoard = new Board(player1, player2);

        assertEquals(newBoard.getPlayer1(), player1);
        assertEquals(newBoard.getPlayer2(), player2);
        assertEquals(newBoard.winner(player1), false);
        assertEquals(newBoard.winner(player2), false);
    }

    @Test
    public void testBoardMove(){
        Player player1 = new Player("player1", 11);
        Player player2 = new Player("player2", 1111);
        Board board = new Board(player1, player2);

        board.move(player1, 0, 0);

        assertEquals(player1.getID(), board.getIDFromMove(0,0) );

        board.move(player2, 1, 1);
        assertEquals(player2.getID(), board.getIDFromMove(1,1));
    }

}
