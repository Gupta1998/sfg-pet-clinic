package guru.springframewok.sfgpetclinic.service;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet Vet);
	
	Set<Vet> findAll();

}
