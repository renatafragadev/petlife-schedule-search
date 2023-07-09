package com.petlife.schedule.port;

import com.petlife.schedule.domain.Pet;
import com.petlife.schedule.domain.Schedule;

import java.util.List;

public interface ScheduleCachePort {

    void save(List<Schedule> schedules);

    List<Schedule> findByPet(Pet pet);
}
