package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Message:");
		messages.add("Hello, this is page \"Hello\"");
		messages.add("1 2 3 4 5 6 7 8 9 А Б В Г Д");
		model.addAttribute("messages", messages);
		return "index";
	}
}