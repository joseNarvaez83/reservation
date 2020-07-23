package com.example.test.reservation.service;

import com.example.test.reservation.web.model.ReservationDto;

import java.util.List;

public interface ReservationService {

    List<ReservationDto> getAllReservations();
}
