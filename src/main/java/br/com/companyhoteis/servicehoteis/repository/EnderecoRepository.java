package br.com.companyhoteis.servicehoteis.repository;

import br.com.companyhoteis.servicehoteis.domain.Endereco;

import java.util.List;

public interface EnderecoRepository {

    void salvarEndereco(Endereco endereco);
    List<Endereco> listarEndereco();
    List<Endereco> listarByIdHotel(Long id);
    Endereco getEndereco(Long id);
    void updateEndereco(Endereco endereco);
}
