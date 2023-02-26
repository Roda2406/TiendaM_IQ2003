
package com.TiendaM_IQ2003.dao;

import com.TiendaM_IQ2003.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
