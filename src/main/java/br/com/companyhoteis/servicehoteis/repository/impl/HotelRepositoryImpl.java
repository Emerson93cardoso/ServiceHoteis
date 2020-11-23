package br.com.companyhoteis.servicehoteis.repository.impl;

import br.com.companyhoteis.servicehoteis.domain.Hotel;
import br.com.companyhoteis.servicehoteis.repository.HotelRepository;
import br.com.companyhoteis.servicehoteis.repository.mapper.HotelRepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class HotelRepositoryImpl implements HotelRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void salvarHotel(Hotel hotel) {
        jdbcTemplate.update("insert into hotel(nome, email, telefone) values(?, ?, ?)",
                hotel.getNome(), hotel.getEmail(), hotel.getTelefone());
    }
    @Override
    public List<Hotel> listarHoteis() {
        List<Hotel> hoteis = jdbcTemplate.query("select * from hotel", new HotelRepositoryMapper());
        return  hoteis;
    }
    public Hotel getHotelById(Long id) {
        Hotel hotel = jdbcTemplate.queryForObject("select * from hotel where id = ?",
                new Object[]{id}, new HotelRepositoryMapper());
        return hotel;
    }
}
