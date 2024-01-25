package com.practica.primerapirest.service;

import com.practica.primerapirest.model.entity.Cliente;

public interface ICliente {
    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);

}
