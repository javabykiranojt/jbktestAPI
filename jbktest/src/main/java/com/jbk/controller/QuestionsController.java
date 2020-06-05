package com.jbk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QuestionsController {

	@RequestMapping("singleQuestion")
	public Question getQuestions() {
		System.out.println("api is called for questions");
		Question question = new Question(); // this is just dummy code
		question.setQuestionText("java is platform independent?");
		question.setOption1("YES");
		question.setOption2("NO");
		question.setCorrectOption("1");
		question.setExplanation("due to byte code... which is os independent");
		return question;
	}
}
