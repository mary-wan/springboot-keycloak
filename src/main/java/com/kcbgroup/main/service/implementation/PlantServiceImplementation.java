package com.kcbgroup.main.service.implementation;

import com.kcbgroup.main.models.Plant;
import com.kcbgroup.main.repository.PlantRepository;
import com.kcbgroup.main.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PlantServiceImplementation implements PlantService {

    @Autowired
    PlantRepository plantRepository;

    @Override
    public Plant getPlant(long plantId) throws RuntimeException {
        Optional<Plant> plantOpt = plantRepository.findById(plantId);

        if (!plantOpt.isPresent()) {
            throw new RuntimeException("Plant could not be found with id : " + plantId);
        }

        return plantOpt.get();
    }
}
