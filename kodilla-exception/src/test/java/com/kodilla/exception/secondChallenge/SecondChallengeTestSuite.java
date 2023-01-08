package com.kodilla.exception.secondChallenge;

import com.kdilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {



    @Test
    void testSecondChallenge() {
        //Given
        SecondChallenge challenger = new SecondChallenge();
        //When & then
        assertDoesNotThrow(() -> challenger.probablyIWillThrowException(1,1));
    }

    @Test
    void differentCasesOfSecondChallenge(){
        //Given
        SecondChallenge challenger = new SecondChallenge();
        //When & then
        assertAll(
                ()->assertThrows(Exception.class,()->challenger.probablyIWillThrowException(3,1)),
                ()->assertThrows(Exception.class,()->challenger.probablyIWillThrowException(0.5,1)),
                ()->assertThrows(Exception.class,()->challenger.probablyIWillThrowException(3,1.5))

        );

    }

}
