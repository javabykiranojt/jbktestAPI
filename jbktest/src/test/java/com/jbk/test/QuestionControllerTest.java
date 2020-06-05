package com.jbk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.jbk.config.StartApplication;
import com.jbk.controller.Question;
@SpringBootTest(classes=StartApplication.class)
@AutoConfigureMockMvc
public class QuestionControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void checkQuestions() throws Exception {
		Question question = new Question(); // this is just dummy code
		question.setQuestionText("java is platform independent?");
		question.setOption1("YES");
		question.setOption2("NO");
		question.setCorrectOption("1");
		question.setExplanation("due to byte code... which is os independent");
		System.out.println(mvc);//http://localhost:9999/api/logincheck
		MvcResult result = mvc
				.perform(MockMvcRequestBuilders.get("http://localhost:9299/api/singleQuestion").contentType(MediaType.APPLICATION_JSON))
				.andReturn();

		int status = result.getResponse().getStatus();
		assertEquals(200, status);
	}

}
