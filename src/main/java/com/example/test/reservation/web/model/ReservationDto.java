package com.example.test.reservation.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Null;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationDto implements Serializable {

    static final long serialVersionUID = 397638520060638747L;

    private int id;

    private String name;

    @Null
    private LocalDateTime time;

}
