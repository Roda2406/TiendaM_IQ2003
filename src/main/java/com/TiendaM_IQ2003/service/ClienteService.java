package com.TiendaM_IQ2003.service;

import com.TiendaM_IQ2003.domain.Cliente;
import java.util.List;

public interface ClienteService {

    public List<Cliente> getClientes();

    public Cliente getCliente(Cliente cliente);

    public void save(Cliente cliente); //Para insertar o modificar (si viene el idCliente o no)

    public void delete(Cliente cliente);

    public List<Cliente> getClientePorNombre(String nombre);

    public List<Cliente> getClientePorTelefono(String nombre);

    public List<Cliente> getClientePorNombreAndApellidos(String nombre, String apellidos);

}
