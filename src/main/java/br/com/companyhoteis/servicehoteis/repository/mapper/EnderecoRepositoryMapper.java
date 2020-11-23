package br.com.companyhoteis.servicehoteis.repository.mapper;

import br.com.companyhoteis.servicehoteis.domain.Endereco;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderecoRepositoryMapper implements RowMapper<Endereco> {

    @Override
    public Endereco mapRow(ResultSet rs, int rowNum) throws SQLException {
       Endereco endereco = new Endereco();
       endereco.setIdHotel(rs.getLong("id_hotel"));
       endereco.setId(rs.getLong("id"));
       endereco.setLogradouro(rs.getString("logradouro"));
       endereco.setEstado(rs.getString("estado"));
       endereco.setComplemento(rs.getString("complemento"));
       endereco.setCep(rs.getString("cep"));
       endereco.setUf(rs.getString("uf"));
       endereco.setNumero(rs.getInt("numero"));
       return endereco;
    }
}
