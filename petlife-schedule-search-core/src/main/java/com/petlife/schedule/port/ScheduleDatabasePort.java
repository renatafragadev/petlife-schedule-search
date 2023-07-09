package com.petlife.schedule.port;

import com.petlife.schedule.domain.Pet;
import com.petlife.schedule.domain.Schedule;

import java.util.List;

public interface ScheduleDatabasePort {

    List<Schedule> findByPet(Pet pet);

}
