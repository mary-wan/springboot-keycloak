package com.kcbgroup.main.service;

import com.kcbgroup.main.models.Plant;
import org.springframework.stereotype.Service;

@Service
public interface PlantService {

    Plant getPlant(long plantId) throws RuntimeException;
}
