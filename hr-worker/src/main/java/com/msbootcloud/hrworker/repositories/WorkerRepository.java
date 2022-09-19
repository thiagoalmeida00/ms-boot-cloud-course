package com.msbootcloud.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msbootcloud.hrworker.entities.Worker;

/**
 * Objetos com métodos para fazer o acesso a dados
 * @author thiag
 * 
 */
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
