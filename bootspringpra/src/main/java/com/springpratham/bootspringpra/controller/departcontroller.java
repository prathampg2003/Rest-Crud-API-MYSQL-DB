package com.springpratham.bootspringpra.controller;

import com.springpratham.bootspringpra.entity.department;
import com.springpratham.bootspringpra.service.depserviceimpl;
import com.springpratham.bootspringpra.service.deptservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class departcontroller {

    @Autowired
    private deptservice deptservice;
    private final Logger logger= LoggerFactory.getLogger(departcontroller.class);
    @PostMapping("/departments") //postmapping for saving all the data
    public department savedepartment(@Valid @RequestBody department depat){
        logger.info("Inside the save department");
        return deptservice.savedepartment(depat); //save all the departments in the database

    }

    @GetMapping("/departments") // get mapping for getting the data
    public List<department> fetchdepartment(){
        return deptservice.fetchdepartment(); //return the list of all the departments
    }

    @GetMapping("/departments/{id}")
    public department fetchdepid(@PathVariable("id")Long departmentId){
        return deptservice.fetchdepartmentid(departmentId);  //fetch the department using id
    }

    @DeleteMapping("/departments/{id}") // delete mapping for the deleting the particular records
    public String deletedeptid(@PathVariable("id")Long deptid){
         deptservice.deletedepartmentid(deptid);
         return "deleted";
    }

    @PutMapping("/departments/{id}") //putmapping is uded to change the entire data.
    public department updatedepartment(@PathVariable("id")Long deptid,@RequestBody department dept){
        return deptservice.updatedept(deptid,dept);
    }

    @PatchMapping("/departments/{id}/{deptname}") //patch mapping is used to change the particular field
    public department patchdept(@PathVariable("id")Long deptid ,@PathVariable("deptname")String deptname ){
        return deptservice.patdept(deptid,deptname);
    }

    @GetMapping("/departments/name/{name}")
    public List<department> getdeptname(@PathVariable("name") String deptname){
        return deptservice.getdeptn(deptname);
    }
}
