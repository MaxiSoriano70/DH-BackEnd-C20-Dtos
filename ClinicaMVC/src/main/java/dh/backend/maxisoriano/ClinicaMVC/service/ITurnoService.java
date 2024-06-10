package dh.backend.maxisoriano.ClinicaMVC.service;


import dh.backend.maxisoriano.ClinicaMVC.Dto.request.TurnoRequestDto;
import dh.backend.maxisoriano.ClinicaMVC.Dto.response.TurnoResponseDto;
import dh.backend.maxisoriano.ClinicaMVC.model.Turno;

import java.util.List;

public interface ITurnoService {
    TurnoResponseDto registrar(TurnoRequestDto turnoRequestDto);
    TurnoResponseDto buscarPorId(Integer id);
    List<TurnoResponseDto> buscarTodos();
    void actualizarTurno(Integer id, TurnoRequestDto turnoRequestDto);
    void eliminarTurno(Integer id);
}
