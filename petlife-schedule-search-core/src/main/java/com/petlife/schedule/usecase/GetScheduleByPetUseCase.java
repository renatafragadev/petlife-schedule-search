package com.petlife.schedule.usecase;

import com.petlife.schedule.domain.Pet;
import com.petlife.schedule.domain.Schedule;
import com.petlife.schedule.port.ScheduleCachePort;
import com.petlife.schedule.port.ScheduleDatabasePort;

import java.util.List;

public class GetScheduleByPetUseCase {

    private final ScheduleCachePort scheduleCachePort;

    private final ScheduleDatabasePort scheduleDatabasePort;

    public GetScheduleByPetUseCase(ScheduleCachePort scheduleCachePort, ScheduleDatabasePort scheduleDatabasePort) {
        this.scheduleCachePort = scheduleCachePort;
        this.scheduleDatabasePort = scheduleDatabasePort;
    }

    public List<Schedule> execute(final String petId) {
        var pet = new Pet(petId, null);

        var result = scheduleCachePort.findByPet(pet);

        return result.isEmpty() ? scheduleDatabasePort.findByPet(pet) : result;
    }
}
