
package com.TiendaM_IQ2003.dao;

import com.TiendaM_IQ2003.domain.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
    public List<Cliente> findByNombre(String nombre);
    
    public List<Cliente> findByTelefono (String nombre);
    
    public List<Cliente> findByNombreAndApellidos (String nombre, String apellidos);

    
}
