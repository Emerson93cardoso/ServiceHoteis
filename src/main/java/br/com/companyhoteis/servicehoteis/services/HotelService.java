package br.com.companyhoteis.servicehoteis.services;

import br.com.companyhoteis.servicehoteis.domain.Hotel;
import br.com.companyhoteis.servicehoteis.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    public void salvarHotel(Hotel hotel) {

        hotelRepository.salvarHotel(hotel);
    }

    public List<Hotel> listarHoteis() {
        List<Hotel> hoteis = hotelRepository.listarHoteis();
        return hoteis;
    }
    public Hotel getHotelById(Long id) {
        Hotel hotel = hotelRepository.getHotelById(id);
        return hotel;
    }

}
