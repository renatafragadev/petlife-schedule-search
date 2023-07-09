package com.petlife.schedule.domain;

import java.time.LocalDateTime;

public record Schedule(
        String name,
        String address,
        LocalDateTime startDateTime,
        LocalDateTime finishDateTime,
        Pet pet,
        Person person
) {
}
