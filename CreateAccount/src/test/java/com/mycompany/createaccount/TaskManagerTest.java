/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.createaccount;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManagerTest {
    
    public TaskManagerTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
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
     * Test of addTask method, of class TaskManager.
     */
    @org.junit.jupiter.api.Test
    public void testAddTask() {
        System.out.println("addTask");
        String taskName = "";
        String taskDescription = "";
        String developerDetails = "";
        int taskDuration = 0;
        TaskManager instance = null;
        String expResult = "";
        String result = instance.addTask(taskName, taskDescription, developerDetails, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class TaskManager.
     */
    @org.junit.jupiter.api.Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        TaskManager instance = null;
        int expResult = 0;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMenu method, of class TaskManager.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        TaskManager instance = null;
        instance.displayMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of part2 method, of class TaskManager.
     */
    @org.junit.jupiter.api.Test
    public void testPart2() {
        System.out.println("part2");
        TaskManager.part2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class TaskManager.
     */
    @org.junit.jupiter.api.Test
    public void testRun() {
        System.out.println("run");
        TaskManager instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
