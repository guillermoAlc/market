package com.gui.market.persistence.crud;

import com.gui.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

    //query method

    Optional<List<Compra>> findByIdCliente (String idCliente);

}
