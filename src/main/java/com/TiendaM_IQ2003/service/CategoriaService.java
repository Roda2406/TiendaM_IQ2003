
package com.TiendaM_IQ2003.service;

import com.TiendaM_IQ2003.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria); //Para insertar o modificar (si viene el idCategoria o no)
    
    public void delete (Categoria categoria);
}
