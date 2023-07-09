package com.petlife.schedule.adapters.elasticsearch.model;

import com.petlife.schedule.domain.Person;
import com.petlife.schedule.domain.Pet;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;

public class ScheduleModel {

    @Id
    private String id;
    private String name;
    private String address;
    private LocalDateTime startDateTime;
    private LocalDateTime finishDateTime;
    private PetModel pet;
    private PersonModel person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getFinishDateTime() {
        return finishDateTime;
    }

    public void setFinishDateTime(LocalDateTime finishDateTime) {
        this.finishDateTime = finishDateTime;
    }

    public PetModel getPet() {
        return pet;
    }

    public void setPet(PetModel pet) {
        this.pet = pet;
    }

    public PersonModel getPerson() {
        return person;
    }

    public void setPerson(PersonModel person) {
        this.person = person;
    }
}
