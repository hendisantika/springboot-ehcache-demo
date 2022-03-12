package com.hendisantika.service;

import com.hendisantika.entity.Employee;
import com.hendisantika.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ehcache-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/03/22
 * Time: 06.45
 */
@Slf4j
@Service
@CacheConfig(cacheNames = "demoCache")
public class EmployeeService {
    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @CachePut(key = "#result.id")
    public Employee saveAction(Employee emp) {
        Employee saveDemp = employeeRepository.save(emp);
        return saveDemp;
    }

    @Cacheable(key = "#id")
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    @Cacheable()
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @CacheEvict(cacheNames = {"demoCache"}, allEntries = true)
    public void evictCache() {
        log.info("Evict all cache entries...");
    }

    public void cacheManager() {
        Cache cache = cacheManager.getCache("demoCache");
        Employee emp = (Employee) cache.get(25).get();
        log.info("from the cacheManager = " + emp);
    }
}
