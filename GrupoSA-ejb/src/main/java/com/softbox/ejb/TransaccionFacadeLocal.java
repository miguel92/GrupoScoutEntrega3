/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softbox.ejb;

import com.softbox.entity.Transaccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author miguel_martin
 */
@Local
public interface TransaccionFacadeLocal {

    void create(Transaccion transaccion);

    void edit(Transaccion transaccion);

    void remove(Transaccion transaccion);

    Transaccion find(Object id);

    List<Transaccion> findAll();

    List<Transaccion> findRange(int[] range);

    int count();
    
    void modificar(Transaccion transaccion);
    
    Long getNextId();
    
    void crear (Transaccion transaccion);
    
}
