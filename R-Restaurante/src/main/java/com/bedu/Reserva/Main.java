package com.bedu.Reserva;

import com.bedu.Reserva.Service.*;

public class Main {
    public static void main(String[] args) {
        DisponibilidadService mockService = (fecha, personas) -> personas <= 4;

        ReservaService reservaService = new ReservaService(mockService);
        reservaService.realizarReserva("2025-05-01", 2);
        reservaService.realizarReserva("2025-05-02", 5);
    }
}
