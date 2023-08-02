package br.com.ada.betbicho.service;

import br.com.ada.betbicho.entity.Bicho;
import br.com.ada.betbicho.repository.BichoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BichoService {


    private final BichoRepository bichoRepository;

    @Autowired
    public BichoService(BichoRepository bichoRepository) {
        this.bichoRepository = bichoRepository;
    }

    public void salvar(Bicho bicho) {
        this.bichoRepository.save(bicho);
        // depositar 100 reais no pix
        //
    }

    public List<Bicho> buscarTodos() {
        return this.bichoRepository.findAll();
    }

    public Bicho buscarPorId(Long id) {
        return this.bichoRepository.findById(id).get();
    }
}
