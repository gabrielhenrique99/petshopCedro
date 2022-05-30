package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Animal;
import com.ifce.br.repository.AnimalRepository;

@Service
public class AnimalService {
	
	@Autowired
	private AnimalRepository animalRepo;
	
	public void cadastrarAnimal(Animal animal) {
		animalRepo.save(animal);
	}
	
	public List<Animal> listarAnimais(){
		return animalRepo.findAll();
	}

}
