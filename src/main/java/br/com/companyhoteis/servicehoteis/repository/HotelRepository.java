package br.com.companyhoteis.servicehoteis.repository;

import br.com.companyhoteis.servicehoteis.domain.Hotel;

import java.util.List;

public interface HotelRepository {

     void salvarHotel(Hotel hotel);
     List<Hotel> listarHoteis();
     Hotel getHotelById(Long id);
}
