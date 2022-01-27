package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldCountSqr() {
        SQRService service = new SQRService();

        int lowerRangeLimit = 100;
        int upperRangeLimit = 900;
        int expected = 21;

        int actual = service.countSqr(lowerRangeLimit, upperRangeLimit);

        assertEquals(expected, actual);

    }
}