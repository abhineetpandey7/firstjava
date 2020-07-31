package com.wipro.unittesting.unittesting.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.wipro.unittesting.unittesting.controller.HelloWorldController;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void helloWorld_basic() throws Exception {
		//call "/hello-world"
		//verify response is hello world
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello-world")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult andReturn = mockMvc.perform(requestBuilder)
				.andExpect(status().isOk())
		        .andExpect(content().string("Hello World"))
				.andReturn();
		//assertEquals("Hello World",andReturn.getResponse().getContentAsString());
	}


}
