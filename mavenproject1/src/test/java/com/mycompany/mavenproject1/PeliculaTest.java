/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DAW106
 */
public class PeliculaTest {
    
    public PeliculaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTitulo method, of class Pelicula.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getDirector method, of class Pelicula.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.getDirector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getFechaLanzamiento method, of class Pelicula.
     */
    @Test
    public void testGetFechaLanzamiento() {
        System.out.println("getFechaLanzamiento");
        Pelicula instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getFechaLanzamiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Pelicula.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
