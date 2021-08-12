package com.gui.market.persistence.crud;

import com.gui.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository <Producto, Integer>{

    //query Metthods

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional <List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
