package com.zemoso;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zemoso.DAO.IEmployeeDAO;
import com.zemoso.DAO.IProjectDAO;
import jpa.Employee;
import jpa.Project;
import jpa.ProjectBrief;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zemoso on 12/7/17.
 */
@EntityScan("jpa")
@RestController
@CrossOrigin
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
    @RequestMapping(value="/employees",method= RequestMethod.GET, produces = "application/json")
    public List<Employee> getEmployees() {

        List<Employee> employeeList = (List<Employee>)iEmployeeDAO.findAll();
        return employeeList;
    }

    /**
     *
     Get the project details of an employee by Employee ID (EID)
     * @param eid
     * @return List<ProjectBrief>
     */
    @RequestMapping(value="/employeeProjects/{eid}",method= RequestMethod.GET)
    @ResponseBody
    public List<ProjectBrief> getEmployeeProjects(@PathVariable("eid")int eid) {

        List<Project> projectList = iProjectDAO.findByEid(eid);

        List<ProjectBrief> result = new ArrayList<ProjectBrief>();
        Iterator itr = projectList.iterator();
        while(itr.hasNext()){
            Object[] p = (Object[])itr.next();
            result.add(new ProjectBrief((Long)p[0],(String)p[1]));
        }
        return result;
    }

    /**
     *
     Get given project's details by project id (PID)
     * @param pid
     * @return List<Project>
     */
    @RequestMapping(value="/projectDetails/{pid}",method= RequestMethod.GET)
    public List<Project> getProjectDetails(@PathVariable("pid")long pid) {

        List<Project> projects = iProjectDAO.findByPid(pid);
        return projects;
    }
}
