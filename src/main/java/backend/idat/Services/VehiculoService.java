package backend.idat.Services;

import backend.idat.Repository.VehiculoRepository;
import backend.idat.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService implements IVehiculoService {
    @Autowired
    public VehiculoRepository vehiculoRepository;
    @Override
    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> listarVehiculo() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerporId(Integer id) {
        return vehiculoRepository.findById(id).orElse(null);
    }
}
