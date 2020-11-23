package br.com.companyhoteis.servicehoteis.repository.impl;

import br.com.companyhoteis.servicehoteis.domain.Endereco;
import br.com.companyhoteis.servicehoteis.repository.EnderecoRepository;
import br.com.companyhoteis.servicehoteis.repository.mapper.EnderecoRepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.beans.Statement;
import java.util.List;

@Repository
public class EnderecoRepositoryimpl implements EnderecoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void salvarEndereco(Endereco endereco) {
        jdbcTemplate.update("insert into endereco(logradouro, numero, complemento, estado, uf, cep, id_hotel) " +
                        "values(?, ?, ?, ?, ?, ?, ?)", endereco.getLogradouro(), endereco.getNumero(),
                endereco.getComplemento(), endereco.getEstado(),
                endereco.getUf(), endereco.getCep(), endereco.getIdHotel());
    }

    public List<Endereco> listarEndereco() {
        List<Endereco> enderecos = jdbcTemplate.query("select * from endereco", new EnderecoRepositoryMapper());
        return enderecos;
    }

    @Override
    public List<Endereco> listarByIdHotel(Long idHotel) {
        List<Endereco> listarByIdHoteis = jdbcTemplate.query(
                "SELECT * FROM endereco" +
                        " WHERE id_hotel = ?", new EnderecoRepositoryMapper(), idHotel);
        return listarByIdHoteis;
    }

    public Endereco getEndereco(Long id) {
        Endereco endereco = jdbcTemplate.queryForObject("SELECT * FROM endereco where id = ?", new Object[]{id}, new EnderecoRepositoryMapper());
        return endereco;
    }


    public void updateEndereco(Endereco endereco) {
        jdbcTemplate.update("UPDATE endereco SET logradouro = ?, " +
                "numero = ?, complemento = ?, estado = ?, uf = ?, cep = ? where id = ? ",endereco.getLogradouro(),
                endereco.getNumero(), endereco.getComplemento(), endereco.getEstado(),
                endereco.getUf(), endereco.getCep(), endereco.getId());
    }

}
