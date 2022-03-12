package com.hendisantika.service;

import com.hendisantika.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

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
    private EmployeeRepository employeeRepository;

}
