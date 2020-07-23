package com.example.test.reservation.web.controller;

import com.example.test.reservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("reservations")
@RestController
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping(produces = {"application/json"})
    public ResponseEntity getReservations(){
        return new ResponseEntity(reservationService.getAllReservations(), HttpStatus.OK);
    }

}
