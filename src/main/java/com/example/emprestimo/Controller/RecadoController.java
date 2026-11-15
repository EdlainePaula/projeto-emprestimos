
package com.example.emprestimo.Controller;

import com.example.emprestimo.Model.Recado;
import com.example.emprestimo.Service.RecadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/recados")
public class RecadoController {

    // Conexão com o Service
    private final RecadoService service;

    // Construtor
    public RecadoController(RecadoService service) {
        this.service = service;
    }

    // Metodo GET: listar todos os recados
    @GetMapping
    public List<Recado> listar() {
        return service.listar();
    }

    // Metodo POST: cadastrar um novo recado
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Recado cadastrar(@RequestBody Recado recado) {
        return service.cadastrar(recado);
    }
}
