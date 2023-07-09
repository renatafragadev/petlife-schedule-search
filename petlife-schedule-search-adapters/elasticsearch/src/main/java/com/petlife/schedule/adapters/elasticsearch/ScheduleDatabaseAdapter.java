package com.petlife.schedule.adapters.elasticsearch;

import com.petlife.schedule.adapters.elasticsearch.model.ScheduleModel;
import com.petlife.schedule.adapters.elasticsearch.repository.ScheduleRepository;
import com.petlife.schedule.domain.Pet;
import com.petlife.schedule.domain.Schedule;
import com.petlife.schedule.port.ScheduleDatabasePort;

import java.util.List;

public class ScheduleDatabaseAdapter implements ScheduleDatabasePort {

    private final ScheduleRepository scheduleRepository;

    public ScheduleDatabaseAdapter(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<Schedule> findByPet(Pet pet) {
        return scheduleRepository.findByPet(pet)
                .stream()
                .map(this::mapFromModel)
                .toList();
    }

    private Schedule mapFromModel(ScheduleModel scheduleModel) {

    }
}
