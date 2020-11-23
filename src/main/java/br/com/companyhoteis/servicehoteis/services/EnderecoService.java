package br.com.companyhoteis.servicehoteis.services;

import br.com.companyhoteis.servicehoteis.domain.Endereco;
import br.com.companyhoteis.servicehoteis.domain.wrappers.ListaEnderecoWrapper;
import br.com.companyhoteis.servicehoteis.repository.EnderecoRepository;
import br.com.companyhoteis.servicehoteis.repository.impl.EnderecoRepositoryimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoService {


    @Autowired
    private EnderecoRepository enderecoRepository;

    public void salvarEndereco(Endereco endereco) {

        enderecoRepository.salvarEndereco(endereco);
    }

    public List<Endereco> listarEndereco() {
        List <Endereco> enderecos = enderecoRepository.listarEndereco();
        return enderecos;
    }

    public List<Endereco> listarByIdHotel(Long idHotel) {
        List<Endereco> listarByIdHoteis = enderecoRepository.listarByIdHotel(idHotel);
        return listarByIdHoteis;
    }

    public Endereco getEndereco(Long id) {
        Endereco endereco = enderecoRepository.getEndereco(id);
        return  endereco;
    }

    public void updateEndereco(Endereco endereco) {
        enderecoRepository.updateEndereco(endereco);
    }
}
