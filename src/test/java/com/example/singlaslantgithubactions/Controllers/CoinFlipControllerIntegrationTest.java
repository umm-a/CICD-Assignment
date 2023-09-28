package com.example.singlaslantgithubactions.Controllers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CoinFlipControllerIntegrationTest {
    @Autowired
    private CoinFlipController coinFlipController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void publishFlipStatus200() throws Exception {
        this.mockMvc.perform(post("/flip?choice=" + "heads"))
                .andExpect(status().isOk());
    }
    @Test
    void publishFlipReturnsViewIndex() throws Exception {
        this.mockMvc.perform(post("/flip?choice=" + "tails"))
                .andExpect(view().name("indexHEJEHJ"));
    }

    @Test
    public void homePageReturnsViewIndex() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(view().name("index"));
    }

    @Test
    public void homePageContainsString_CoinFlipGame() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(content().string(containsString("Coin Flip Game")));
    }
}
