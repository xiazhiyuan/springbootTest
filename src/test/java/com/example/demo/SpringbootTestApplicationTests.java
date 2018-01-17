package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.example.demo.web.* ;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=HelloController.class)
public class SpringbootTestApplicationTests {
	private MockMvc mvc ;
	@Test
	public void contextLoads() {
	}

	@Before
	public void setup(){
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build() ;
	}

	@Test
	public void hello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get(	"/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string	(equalTo("hello word")));
	}

}
