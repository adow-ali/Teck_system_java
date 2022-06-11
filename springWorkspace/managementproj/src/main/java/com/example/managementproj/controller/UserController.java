package com.example.managementproj.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.example.managementproj.entity.UserEntity;
import com.example.managementproj.service.UserService;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value="/list-users")  // you can also do @RequestMapping
	public String showUsers(Model model) {
		List<UserEntity> users = userService.getAllUsers();
		// Model allows us to add attributes into our POJOS / entities, without changing the object directly
		model.addAttribute("users", users);
		model.addAttribute("users", new UserEntity());
		return "user"; // returns a list in an HTML
	}
	
	@PostMapping(value="/add-user")
	public String addUser(ModelMap model, @Valid UserEntity userEntity, BindingResult bindingResult) {
		// checking for a null entry
		if(bindingResult.hasErrors()) {
			return "userEntity";  // returns HTML page
		}
		
		userService.addUser(userEntity);
		
		return "redirect:/"; // return to the user list (whatever that means..)
	}
	
	@GetMapping(path="/{id}") // curly braces to grab id
	public String getUser(@PathVariable("id") Integer id, Model model) {   // there's a path variable, associating it as a number
		
		Optional<UserEntity> userInfo = userService.getUsernameById(id);
		model.addAttribute("userInfo", userInfo);
		return "edit";
	}
	
	@PostMapping(path="/{id}")
	public RedirectView updateUser(RedirectAttributes redirectAttributes, @PathVariable("id") Integer id, @ModelAttribute UserEntity userInfo) {
		userService.updateUser(id, userInfo);
		String message=(userInfo.isActive() ? "Update " : "Delete") + " <b>" + userInfo.getUsername() + "</b>**";
        RedirectView redirectView = new RedirectView("/", true);
        redirectAttributes.addFlashAttribute("userMessage", message); // this is a display, it's going to flash this message
        return redirectView;
	}
	
}
