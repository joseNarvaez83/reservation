package com.example.test.reservation.web;

import com.example.test.reservation.model.Reservation;
import com.example.test.reservation.service.ReservationService;
import com.example.test.reservation.web.controller.ReservationController;
import com.example.test.reservation.web.model.ReservationDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ReservationController.class)
class ReservationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ReservationService reservationService;

    @Test
    void getReservations() throws Exception {
        given(reservationService.getAllReservations()).willReturn(
                getReservationsListDto()
        );

        mockMvc.perform(get("/reservations"))
                .andExpect(status().isOk());
    }

    private List<ReservationDto> getReservationsListDto() {
        List<ReservationDto> reservations = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            reservations.add(ReservationDto.builder()
                    .id(i)
                    .name("Reservation No." + i)
                    .build());
        }

        return reservations;
    }
}