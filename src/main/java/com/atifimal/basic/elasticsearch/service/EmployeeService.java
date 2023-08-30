package com.atifimal.basic.elasticsearch.service;

import com.atifimal.basic.elasticsearch.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.client.RestClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final RestClient restClient;
    
}
