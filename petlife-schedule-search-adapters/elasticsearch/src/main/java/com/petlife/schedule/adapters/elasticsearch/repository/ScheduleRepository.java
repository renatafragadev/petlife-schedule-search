package com.petlife.schedule.adapters.elasticsearch.repository;

import com.petlife.schedule.adapters.elasticsearch.model.ScheduleModel;
import com.petlife.schedule.domain.Pet;
import com.petlife.schedule.domain.Schedule;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ScheduleRepository extends ElasticsearchRepository<ScheduleModel, String> {

    List<ScheduleModel> findByPet(Pet pet);
}
