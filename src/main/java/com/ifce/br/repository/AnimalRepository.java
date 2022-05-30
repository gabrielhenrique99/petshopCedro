package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifce.br.model.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
