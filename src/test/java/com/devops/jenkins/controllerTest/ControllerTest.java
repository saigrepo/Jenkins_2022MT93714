package com.devops.jenkins.controllerTest;

import com.devops.jenkins.controller.Controller;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ControllerTest {

    @Autowired
    Controller testController;

    @Test
    public void testHelloWorld() {
        assertEquals("Welcome to Devops Assignment", testController.helloWorld());
    }

    @Test
    public void testGenerateEvenNumbersScenario() {
        assertEquals(50, testController.generateEvenNumbers());
    }
}
