package com.kcbgroup.main.repository;

import com.kcbgroup.main.models.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Long> {
}
