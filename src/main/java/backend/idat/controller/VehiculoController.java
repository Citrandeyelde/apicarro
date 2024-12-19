package backend.idat.controller;

import backend.idat.Services.VehiculoService;
import backend.idat.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@Controller
@EnableWebMvc
@RequestMapping("")
public class VehiculoController {
    @Autowired
    public VehiculoService vehiculoService;

    @GetMapping("/inicio")
    public String Iniciar() {
        return "index.html";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Vehiculo> listarJson(){
        List<Vehiculo> vehiculo = vehiculoService.listarVehiculo();
        return vehiculo;
    }

    @GetMapping("/listar/{id}")
    @ResponseBody
    public Vehiculo listarid(@PathVariable("id") Integer id){
        Vehiculo vehiculo = vehiculoService.obtenerporId(id);
        return vehiculo;
    }
}
