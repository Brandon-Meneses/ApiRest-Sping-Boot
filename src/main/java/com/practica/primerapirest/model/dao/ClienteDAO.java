package com.practica.primerapirest.model.dao;

import com.practica.primerapirest.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteDAO extends CrudRepository<Cliente, Integer>
{

}
