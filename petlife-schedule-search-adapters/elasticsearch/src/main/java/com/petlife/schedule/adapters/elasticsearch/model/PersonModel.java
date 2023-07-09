package com.petlife.schedule.adapters.elasticsearch.model;

import com.petlife.schedule.domain.PersonType;

public class PersonModel {

    private String id;

    private String name;

    private PersonType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }
}
