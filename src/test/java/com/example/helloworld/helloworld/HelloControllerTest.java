package com.example.helloworld.helloworld;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

  private final MockMvc mvc;

  @Autowired
  public HelloControllerTest(MockMvc mvc) {
    this.mvc = mvc;
  }

  @Test
  public void getHello() throws Exception {
    ResultActions result = mvc.perform(
        MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON));

    System.out.println(result.toString());

    result.andExpect(status().isOk())
        .andExpect(content().string(equalTo("Hello, World!")));
  }
}
