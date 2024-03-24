package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTest {

    @Test
    void testProbablyIWillThrowException() {
        SecondChallenge secondChallenge = new SecondChallenge();

        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
    }
}