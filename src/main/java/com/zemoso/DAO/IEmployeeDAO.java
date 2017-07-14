package com.zemoso.DAO;

import jpa.Employee;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by zemoso on 12/7/17.
 */
@Transactional
public interface IEmployeeDAO extends CrudRepository<Employee,Long>{ }
