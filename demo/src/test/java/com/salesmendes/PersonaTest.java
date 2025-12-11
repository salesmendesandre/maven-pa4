package com.salesmendes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testFactory() {
        // AAA (Arrange, Act, Assert)
        // Arrange
        String input = "Juan,Garcia,25,juan@email.com";
        // Act
        Persona persona = Persona.factory(input);
        // Assert
        assertNotNull(persona);
        assertEquals("Juan", persona.getNombre());
        assertEquals("Garcia", persona.getApellidos());
        assertEquals(25, persona.getEdad());
        assertEquals("juan@email.com", persona.getEmail());
    }

    @Test
    void fromString_ShouldThrowException_WhenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> Persona.factory(input));
    }

    @Test
    void fromString_ShouldThrowException_WhenEdadIsChar() {
        String input = "Juan,Garcia,qwer,juan@email.com";
        assertThrows(IllegalArgumentException.class, () -> Persona.factory(input));
    }
}
