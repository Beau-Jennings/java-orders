package com.javaorders.demo.services;


import com.javaorders.demo.models.Agent;
import com.javaorders.demo.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class AgentServicesImpl implements AgentServices
{
    @Autowired
    private AgentsRepository agentsRepository;

    @Transactional
    @Override
    public Agent save(Agent agent)
    {
        return agentsRepository.save(agent);
    }
}
