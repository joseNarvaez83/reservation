package com.example.test.reservation.bootstrap;

import com.example.test.reservation.model.Reservation;
import com.example.test.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Profile("default || local")
@RequiredArgsConstructor
@Component
public class ReservationLoader implements CommandLineRunner {

    private final ReservationRepository reservationRepository;

    @Override
    public void run(String... args) throws Exception {
        if (reservationRepository.count() == 0){
            log.debug("Reservation loader was executed, added initial data!");
            reservationsInit();
        }
    }

    private void reservationsInit() {
        List<Reservation> reservations = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            reservations.add(Reservation.builder()
                    .id(i)
                    .name("Reservation test azure No." + i)
                    .build());
        }

        reservationRepository.saveAll(reservations);
    }
}
