package br.com.companyhoteis.servicehoteis.domain.wrappers;

import br.com.companyhoteis.servicehoteis.domain.Hotel;

import java.util.List;

public class ListaHoteisWrapper {

    private final List<Hotel> hoteis;

    public ListaHoteisWrapper(List<Hotel> lista) {

        this.hoteis = lista;
    }

    public List<Hotel> getHoteis() {

        return hoteis;
    }
}
