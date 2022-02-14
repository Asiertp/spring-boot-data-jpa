package com.bolsadeideas.springboot.app.models.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IclienteDao extends PagingAndSortingRepository<Cliente, Long>{

	
}
