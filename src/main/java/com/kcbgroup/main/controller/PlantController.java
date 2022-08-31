package com.kcbgroup.main.controller;

import com.kcbgroup.main.models.Plant;
import com.kcbgroup.main.service.PlantService;
import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/plant")
public class PlantController {

    private PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping("/{plantId}")
    public Plant getPlant(@PathVariable @NotNull Long plantId) {

        log.info("Request for plant " + plantId + " received");

        return plantService.getPlant(plantId);
    }
}