package com.example.test.reservation.service;

import com.example.test.reservation.repository.ReservationRepository;
import com.example.test.reservation.web.mappers.ReservationMapper;
import com.example.test.reservation.web.model.ReservationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper;

    @Override
    public List<ReservationDto> getAllReservations() {

        return reservationRepository.findAll().stream()
                .map(reservationMapper::reservationToReservationDto)
                .collect(Collectors.toList());
    }
}
