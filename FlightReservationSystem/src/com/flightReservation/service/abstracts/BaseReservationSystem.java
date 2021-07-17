package com.flightReservation.service.abstracts;

import com.flightReservation.model.Airplain;

public interface BaseReservationSystem {
    abstract void getReservation(Airplain airplain);
}
