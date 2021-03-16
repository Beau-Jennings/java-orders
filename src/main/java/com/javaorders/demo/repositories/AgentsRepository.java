package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long>
{
}