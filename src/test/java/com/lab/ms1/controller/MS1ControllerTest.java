package com.lab.ms1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MS1Controller.class)
public class MS1ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addEndpointReturnsSumOfNegativeAndPositive() throws Exception {
        mockMvc.perform(
                    get("/ms1/add")
                        .param("a", "-5")
                        .param("b", "5")
                )
                .andExpect(status().isOk())
                .andExpect(content().string("MS1 Addition = 0"));
    }
}
