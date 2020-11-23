package br.com.companyhoteis.servicehoteis.domain.wrappers;

import br.com.companyhoteis.servicehoteis.domain.Endereco;

import java.util.List;

public class ListaEnderecoWrapper {

    private final List<Endereco> enderecos;

    public ListaEnderecoWrapper(List<Endereco> lista) {
        this.enderecos = lista;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }
}
