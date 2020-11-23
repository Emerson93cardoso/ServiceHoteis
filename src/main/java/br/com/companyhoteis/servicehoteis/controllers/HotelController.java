package br.com.companyhoteis.servicehoteis.controllers;

import br.com.companyhoteis.servicehoteis.domain.Endereco;
import br.com.companyhoteis.servicehoteis.domain.Hotel;
import br.com.companyhoteis.servicehoteis.domain.wrappers.ListaEnderecoWrapper;
import br.com.companyhoteis.servicehoteis.domain.wrappers.ListaHoteisWrapper;
import br.com.companyhoteis.servicehoteis.services.EnderecoService;
import br.com.companyhoteis.servicehoteis.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<Hotel> salvar(@RequestBody @Valid Hotel hotel) {
        hotelService.salvarHotel(hotel);
        return ResponseEntity.ok(null);
    }
    @GetMapping("/listar")
    public ListaHoteisWrapper listarHoteis() {

        return new ListaHoteisWrapper(hotelService.listarHoteis());
    }

    @GetMapping("/{id}/enderecos")
    public ListaEnderecoWrapper listarByIdHotel(@PathVariable("id") Long idhotel) {
        return new ListaEnderecoWrapper(enderecoService.listarByIdHotel(idhotel));
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable("id") Long id) {
       Hotel hotel = hotelService.getHotelById(id);
        return hotel;
    }

    @PostMapping("/endereco")
    public ResponseEntity<Void> salvarEndereco(@Valid @RequestBody Endereco endereco) {
        enderecoService.salvarEndereco(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    // Ajustar metodo abaixo, esta listando todos os endereços
    @GetMapping("/{id}/listar-enderecos")
    public List<Endereco> listarEnderecos() {
        List<Endereco> enderecos = enderecoService.listarEndereco();
        return enderecos;
    }

    @GetMapping("/{id}/get-endereco")
    public Endereco getEndereco(@PathVariable("id") Long id) {
        Endereco endereco = enderecoService.getEndereco(id);
        return endereco;
    }
    @PostMapping("/editar-endereco")
    public ResponseEntity<Void> updateEndereco(@RequestBody Endereco endereco) {
        enderecoService.updateEndereco(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
