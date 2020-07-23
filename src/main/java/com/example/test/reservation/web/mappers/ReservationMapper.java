package com.example.test.reservation.web.mappers;

import com.example.test.reservation.model.Reservation;
import com.example.test.reservation.web.model.ReservationDto;
import org.mapstruct.Mapper;

@Mapper
public interface ReservationMapper {

    ReservationDto reservationToReservationDto(Reservation reservation);
    Reservation reservationDtoToReservation(ReservationDto reservationDto);
}
