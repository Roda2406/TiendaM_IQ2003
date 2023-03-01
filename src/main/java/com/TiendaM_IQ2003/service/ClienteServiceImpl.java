package com.TiendaM_IQ2003.service;

import com.TiendaM_IQ2003.dao.ClienteDao;
import com.TiendaM_IQ2003.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    ClienteDao clienteDao;
    
    @Override
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }
    
    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }
    
    @Override
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }
    
    @Override
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }
    
}
