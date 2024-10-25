package us.dit.fs;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorUsuariosTest {

    GestorUsuarios Gestor = new GestorUsuarios();

    @Test
    public void testUsuarioMasJoven() {
        Usuario usu1 = new Usuario("123456789A", "Pepe", LocalDate.of(2023, 5, 1) , 56.89);
        Usuario usu2 = new Usuario("123456789A", "Juan", LocalDate.of(2023, 4, 1) , 56.89);
        GestorUsuarios Gestor = new GestorUsuarios();
        assertNotNull(Gestor, "Object not created");
        Gestor.agregarUsuario(usu1.getNombre(),usu1);
        Gestor.agregarUsuario(usu2.getNombre(),usu2);
        assertEquals(usu1, Gestor.obtenerUsuarioMasJoven(), "No se ha indicado más joven");

    }
}