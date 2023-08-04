package br.com.ada.betbicho.controller;

import br.com.ada.betbicho.dto.BichoRequestDTO;
import br.com.ada.betbicho.dto.BichoResponseDTO;
import br.com.ada.betbicho.entity.Bicho;
import br.com.ada.betbicho.service.BichoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bichos")
public class BichoController {

    private final BichoService bichoService;

    @Autowired
    public BichoController(BichoService bichoService) {
        this.bichoService = bichoService;
    }

    @PostMapping
    public ResponseEntity<BichoResponseDTO> cadastrar(@RequestBody BichoRequestDTO bichoRequestDTO) {
        return ResponseEntity.ok(this.bichoService.salvar(bichoRequestDTO));
    }

//    @GetMapping
//    public ResponseEntity<List<Bicho>> buscarTodos() {
//        return ResponseEntity.ok(this.bichoService.buscarTodos());
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Bicho> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(this.bichoService.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<Bicho> buscarPorIdParam(@RequestParam(required = false) Long id, @RequestParam(required = false) String nome) {
        return ResponseEntity.ok(this.bichoService.buscar(id, nome));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        this.bichoService.deletar(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<BichoResponseDTO> atualizar(@RequestBody BichoRequestDTO bichoRequestDTO, @PathVariable Long id) {
        return ResponseEntity.ok(this.bichoService.atualizar(bichoRequestDTO, id));
    }


}
