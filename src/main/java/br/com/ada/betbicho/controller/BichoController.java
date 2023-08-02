package br.com.ada.betbicho.controller;

import br.com.ada.betbicho.service.BichoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bichos")
public class BichoController {

    private final BichoService bichoService;

    @Autowired
    public BichoController(BichoService bichoService) {
        this.bichoService = bichoService;
    }
}
