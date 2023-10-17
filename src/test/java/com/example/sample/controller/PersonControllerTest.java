package com.example.sample.controller;

import com.example.sample.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class PersonControllerTest {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    PersonRepository personRepository;

    @Test
    void getAll() throws Exception {
        mockMvc.perform(get("/people"))
                .andExpect(status().isOk());
    }
}