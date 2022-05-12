package coing.test.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test fun addsPositiveNumbers() {
        val classUnderTest = App()
        assertEquals(3, classUnderTest.sum(1,2))
    }

    @Test fun addsNegativeNumbers() {
        val classUnderTest = App()
        assertEquals(-3, classUnderTest.sum(-1,-2))
    }

    @Test fun addsDifferentlySignedNumbers() {
        val classUnderTest = App()
        assertEquals(-1, classUnderTest.sum(1,-2))
    }

    @Test fun addingZeroPreservesNumber() {
        val classUnderTest = App()
        assertEquals(5, classUnderTest.sum(5,0))
    }
}
