package com.zemoso.DAO;

import jpa.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by zemoso on 13/7/17.
 */
@Transactional
public interface IProjectDAO extends CrudRepository<Project,Long> {

    @Query("select p.pid, p.title from Project as p join p.employeeProjects as ep where ep.eid = :eid")
    List<Project> findByEid(@Param("eid") Integer id);

    //@Query("select p.pid, p.title, p.startedOn, p.projectTechnology from Project as p where p.pid = :pid")
    Project findByPid(@Param("pid") Long pid);
}
