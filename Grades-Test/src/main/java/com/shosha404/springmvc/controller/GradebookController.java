package com.shosha404.springmvc.controller;

import com.shosha404.springmvc.models.gradebook.Gradebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GradebookController {

	@Autowired
	private Gradebook gradebook;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getStudents(Model m) {
		return "index";
	}


	@GetMapping("/studentInformation/{id}")
		public String studentInformation(@PathVariable int id, Model m) {
		return "studentInformation";
		}

}
