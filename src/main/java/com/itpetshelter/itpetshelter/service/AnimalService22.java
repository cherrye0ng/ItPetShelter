package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Animal;
import com.itpetshelter.itpetshelter.dto.Animal2DTO;


import java.util.List;

public interface AnimalService22 {

    List<Animal2DTO> getAllAnimals();
    Animal2DTO read(Long ano);
    Animal2DTO entityToDTO(Animal animal);

}
