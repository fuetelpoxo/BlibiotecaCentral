/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

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
public class VideotecaTest {
    
    public VideotecaTest() {
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
     * Test of consultarPelicula method, of class Videoteca.
     */
    @Test
    public void testConsultarPelicula() {
        System.out.println("consultarPelicula");
        String titulo = "";
        Videoteca instance = null;
        Pelicula expResult = null;
        Pelicula result = instance.consultarPelicula(titulo);
        assertEquals(expResult, result);
        //assertNull();
        //assertNotNull();
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

    