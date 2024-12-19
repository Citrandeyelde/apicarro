package backend.idat.Services;

import backend.idat.model.Vehiculo;

import java.util.List;

public interface IVehiculoService {
    Vehiculo guardarVehiculo(Vehiculo vehiculo);
    List<Vehiculo> listarVehiculo();

    Vehiculo obtenerporId(Integer id);
}
