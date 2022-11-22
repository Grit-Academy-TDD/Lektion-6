package org.example.services;

import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testInputNameIsCorrect() {
        String name = "Omar\nKalthoum";
        ByteArrayInputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);
        Main.main(null);
        assertEquals("Omar Kalthoum", Main.name);
    }

    @Test
    public void whenUserIsOlderOrEqualsThan18_resultShouldReturnAdult() {
        String age = "19";
        ByteArrayInputStream in = new ByteArrayInputStream(age.getBytes());
        System.setIn(in);
        Main.getUserAge();
        assertTrue(Main.isAdult);
    }

    @Test
    @DisplayName("Is not adult when younger than 18")
    public void whenUserIsYoungerThan18_resultShouldReturnNotAdult() {
        String age = "12";
        ByteArrayInputStream in = new ByteArrayInputStream(age.getBytes());
        System.setIn(in);
        Main.getUserAge();
        assertFalse(Main.isAdult);
    }

    @Test
    @DisplayName("Exception When input in not an integer")
    public void whenUserInputsWrongAge_resultShouldReturnNotAdult() {
        String age = "odt";
        ByteArrayInputStream in = new ByteArrayInputStream(age.getBytes());
        System.setIn(in);
        assertThrows(NumberFormatException.class, Main::getUserAge);
    }


}