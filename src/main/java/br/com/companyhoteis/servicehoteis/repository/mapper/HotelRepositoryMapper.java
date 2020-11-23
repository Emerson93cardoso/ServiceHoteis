package br.com.companyhoteis.servicehoteis.repository.mapper;

import br.com.companyhoteis.servicehoteis.domain.Endereco;
import br.com.companyhoteis.servicehoteis.domain.Hotel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HotelRepositoryMapper implements RowMapper<Hotel> {

    @Override
    public Hotel mapRow(ResultSet rs, int rowNum) throws SQLException {
            Hotel hotel = new Hotel();
            hotel.setId(rs.getLong("id"));
            hotel.setNome(rs.getString("nome"));
            hotel.setTelefone(rs.getString("telefone"));
            hotel.setEmail(rs.getString("email"));
            return hotel;
    }

}
