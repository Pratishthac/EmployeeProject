package com.zemoso;

import com.zemoso.DAO.IEmployeeDAO;
import com.zemoso.DAO.IProjectDAO;
import jpa.Employee;
import jpa.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zemoso on 12/7/17.
 */
@EntityScan("jpa")
@RestController
@RequestMapping("employeeDetails")
public class MainController{

    @Autowired
    IEmployeeDAO iEmployeeDAO;

    @Autowired
    IProjectDAO iProjectDAO;

    /**
     *
     Get details of all the employees
     @return  List<Employees>
     */
    @RequestMapping(value="/employees",method= RequestMethod.GET)
    public List<Employee> getEmployees() {

        List<Employee> employeeList = (List<Employee>)iEmployeeDAO.findAll();
        return employeeList;
    }

    /**
     *
     Get the project details of an employee by Employee ID (EID)
     * @param eid
     * @return ListProjects>
     */
    @RequestMapping(value="/employeeProjects/{eid}",method= RequestMethod.GET)
    public List<Project> getEmployeeProjects(@PathVariable("eid")int eid) {

        List<Project> projectList = iProjectDAO.findByEid(eid);
        return projectList;
    }

    /**
     *
     Get given project's details by project id (PID)
     * @param pid
     * @return List<Project>
     */
    @RequestMapping(value="/projectDetails/{pid}",method= RequestMethod.GET)
    public Project getProjectDetails(@PathVariable("pid")long pid) {

        Project project = iProjectDAO.findByPid(pid);
        return project;
    }
}
