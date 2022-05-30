package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Animal;
import com.ifce.br.service.AnimalService;

@Controller
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;
	
	@GetMapping("animal/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@GetMapping("/animal/salvar")
	public String salvar(Animal animal){
		animalService.cadastrarAnimal(animal);
		return "sucesso";
	}
	
	@GetMapping("/animal/listar")
	public ModelAndView listarAnimais() {
		List<Animal> animais = animalService.listarAnimais();
		
		//ponte entre o frontend e o backend
		ModelAndView mv = new ModelAndView("listagem-animal");
		mv.addObject("listaAnimais", animais);
		return mv;
	}

}
