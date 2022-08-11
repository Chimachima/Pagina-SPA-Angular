package com.database.bancoDeDados;

import com.database.bancoDeDados.models.MoviesModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MoviesControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    MoviesModel moviesModel = new MoviesModel("Test", 120, "Action", "Test");

    @Test
    public void getAllTest() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

    @Test
    public void postTest() throws Exception{
        mockMvc.perform(post("/")
                .contentType("application/json")
                        .content(objectMapper.writeValueAsString(moviesModel)))
                .andExpect(status().isOk());

    }
}
