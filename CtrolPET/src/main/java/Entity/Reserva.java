package Entity;


import Entity.Enum.EstadoReserva;

import java.time.Instant;
import java.time.LocalDateTime;

public class Reserva {
    // ObjectId id_Reserva
    // ObjectId id_Empleado
    LocalDateTime fecha;
    EstadoReserva estado;
    Mascota mascota;
    Servicio servicio;

    public Reserva(LocalDateTime fecha, EstadoReserva estado, Mascota mascota, Servicio servicio) {
        this.fecha = fecha;
        this.estado = estado;
        this.mascota = mascota;
        this.servicio = servicio;
    }

    public Reserva() {
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
