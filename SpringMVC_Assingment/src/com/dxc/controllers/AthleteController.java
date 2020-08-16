package com.dxc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.beans.Athlete;

import com.dxc.repository.AthleteRepo;

@Controller
public class AthleteController {

	@Autowired
	AthleteRepo repo;
	
	@RequestMapping("/")
	public String display()
	{
		return "index";
	}
	
	@RequestMapping("add")
	public ModelAndView showform()
	{
		return new ModelAndView("add","command",new Athlete());
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("athlete") Athlete athlete) {
		repo.addAthlete(athlete);// add product to repo
		return new ModelAndView("redirect:/view");
	}

	@RequestMapping("/view")
	public ModelAndView viewAthlete() {
		return new ModelAndView("view", "list", repo.getAthelete());
	}

}
