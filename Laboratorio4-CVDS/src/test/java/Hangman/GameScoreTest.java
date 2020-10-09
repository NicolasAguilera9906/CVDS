package Hangman;
import hangman.model.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * Original Score
 Numero  	              Clase de equivalencia 		                       Resultado
 # Letras correctas	     # Letras Incorrectas
 1	                   < 0		                                            Incorrecto
 2		                                        < 0	                        Incorrecto
 3	                LC >= 0	                      0	                           100
 4	                LC > 0	                 LI > 0  ^ LI < 11	           100 - (10 * LI)
 5	                LC > 0	                    LI > 11	                        0
 */

/**
 * Bonus Score
 Numero 	              Clase de equivalencia 		                        Resultado
 # Letras correctas	    # Letras Incorrectas
 1	                   < 0 		                                                Incorrecto
 2		                                      < 0 	                            Incorrecto
 3	                  LC >= 0 	                0	                             LC * 10
 4	                  LC > 0 	             LI < LC 	                    (LC * 10) - (LI * 5)
 5	                  LC > 0 	            LI >= LC * 2 	                        0
 */


/**
 * Power Score
 Numero 	              Clase de equivalencia 		                        Resultado
 # Letras correctas	    # Letras Incorrectas
 1	                    < 0 		                                            Incorrecto
 2		                                        < 0	                            Incorrecto
 3	                  LC > 0 	                  0	                        La $i-ésima$ letra correcta se bonifica con $5^i$
 4	                    0	                    LI > 0 	                            0
 5	                LC >= 4 	                  0	                                500
 6	                LC > 1	                    LI > 0 	                    La $i-ésima$ letra correcta se bonifica con $5^i$ - (8*LI)
 */
public class GameScoreTest {

    @Test
    public void validateInvalidParameters() {
        GameScore game;
        try {
            game = new OriginalScore();
            game.CalculateScore(-2, -3);
            Assert.assertTrue(false);
        } catch (GameScoreException e) {
            Assert.assertTrue(true);
        }
        try {
            game = new PowerScore();
            game.CalculateScore(-2, -3);
            Assert.assertTrue(false);
        } catch (GameScoreException e) {
            Assert.assertTrue(true);
        }

        try {
            game = new BonusScore();
            game.CalculateScore(-2, -3);
            Assert.assertTrue(false);
        } catch (GameScoreException e) {
            Assert.assertTrue(true);
        }
    }
    

    @Test
    public void validOriginScoreOnlyCorrectLetters() throws GameScoreException {
        GameScore game = new OriginalScore();
        int score = game.CalculateScore(10,0);
        Assert.assertTrue(score == 100);
    }

    @Test
    public void validOriginScorePenalty() throws GameScoreException {
        GameScore game = new OriginalScore();
        int score = game.CalculateScore(2,5);
        Assert.assertTrue(score == 50);
    }
    @Test
    public void validOriginScoreMinScore() throws GameScoreException {
        GameScore game = new OriginalScore();
        int score = game.CalculateScore(2,11);
        Assert.assertTrue(score == 0);
    }

    @Test
    public void validBonusScoreOnlyCorrectLetters() throws GameScoreException {
        GameScore game = new BonusScore();
        int score = game.CalculateScore(10,0);
        Assert.assertTrue(score == 100);
    }

    @Test
    public void validBonusScoreCorrectLettersAndPenalty() throws GameScoreException {
        GameScore game = new BonusScore();
        int score = game.CalculateScore(10,8);
        Assert.assertTrue(score == 60);
    }


    @Test
    public void validBonusScoreCorrectMinScore() throws GameScoreException {
        GameScore game = new BonusScore();
        int score = game.CalculateScore(10,20);
        Assert.assertTrue(score == 0);
    }

    @Test
    public void validPowerScoreOnlyCorrectLetters() throws GameScoreException {
        GameScore game = new PowerScore();
        int score = game.CalculateScore(3,0);
        Assert.assertTrue(score == 155);
    }

    @Test
    public void validPowerScoreCorrectMinScore() throws GameScoreException {
        GameScore game = new PowerScore();
        int score = game.CalculateScore(0,1);
        Assert.assertTrue(score == 0);
    }

    @Test
    public void validPowerScoreCorrectMaxScore() throws GameScoreException {
        GameScore game = new PowerScore();
        int score = game.CalculateScore(4,1);
        Assert.assertTrue(score == 500);
    }

    @Test
    public void validPowerScoreCorrectLettersAndPenalty() throws GameScoreException {
        GameScore game = new PowerScore();
        int score = game.CalculateScore(3,1);
        Assert.assertTrue(score == 147);
    }
}
