package com.bedu.Reserva.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ReservaServiceTest {

    private DisponibilidadService disponibilidadService;
    private ReservaService reservaService;

    @BeforeEach
    void setUp() {
        disponibilidadService = mock(DisponibilidadService.class);
        reservaService = new ReservaService(disponibilidadService);
    }

    @Test
    void reservaConfirmadaCuandoHayDisponibilidad() {
        when(disponibilidadService.hayDisponibilidad("2025-05-01", 2)).thenReturn(true);

        boolean resultado = reservaService.realizarReserva("2025-05-01", 2);

        verify(disponibilidadService).hayDisponibilidad("2025-05-01", 2);
        assertTrue(resultado);
    }

    @Test
    void reservaRechazadaCuandoNoHayDisponibilidad() {
        when(disponibilidadService.hayDisponibilidad("2025-05-02", 5)).thenReturn(false);

        boolean resultado = reservaService.realizarReserva("2025-05-02", 5);

        verify(disponibilidadService).hayDisponibilidad("2025-05-02", 5);
        assertFalse(resultado);
    }
}
