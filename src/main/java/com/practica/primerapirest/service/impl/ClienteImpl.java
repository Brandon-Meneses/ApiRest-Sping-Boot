package com.practica.primerapirest.service.impl;

import com.practica.primerapirest.model.dao.ClienteDAO;
import com.practica.primerapirest.model.entity.Cliente;
import com.practica.primerapirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImpl implements ICliente {
    @Autowired

    private ClienteDAO clienteDAO;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDAO.delete(cliente);
    }
}
