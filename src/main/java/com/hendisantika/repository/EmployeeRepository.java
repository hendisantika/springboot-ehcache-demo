package com.hendisantika.repository;

import com.hendisantika.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ehcache-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/03/22
 * Time: 06.44
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
