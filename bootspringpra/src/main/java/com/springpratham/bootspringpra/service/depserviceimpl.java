package com.springpratham.bootspringpra.service;

import com.springpratham.bootspringpra.entity.department;
import com.springpratham.bootspringpra.repository.deptrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

//dept service implemet it will implement all functions present in the interface
@Service
public class depserviceimpl implements deptservice {
    @Autowired
    private deptrepos deptrepos;

    @Override
    public department savedepartment(department depat) {
        return deptrepos.save(depat);
    }

    @Override
    public List<department> fetchdepartment() {
        return deptrepos.findAll();
    }

    @Override
    public department fetchdepartmentid(Long departmentid) {
        return deptrepos.findById(departmentid).get();
    }

    @Override
    public void deletedepartmentid(Long deptid) {
        deptrepos.deleteById(deptid);
    }

    @Override
    public department updatedept(Long deptid, department dept) {
        department db=deptrepos.findById(deptid).get();
        if(Objects.nonNull(dept.getDepartmentname()) && !"".equalsIgnoreCase(dept.getDepartmentname())){
            db.setDepartmentname(dept.getDepartmentname());
        }
        if(Objects.nonNull(dept.getDepartmentaddress()) && !"".equalsIgnoreCase(dept.getDepartmentaddress())){
            db.setDepartmentaddress(dept.getDepartmentaddress());
        }
        if(Objects.nonNull(dept.getDepartmentCode()) && !"".equalsIgnoreCase(dept.getDepartmentCode())){
            db.setDepartmentCode(dept.getDepartmentCode());
        }
        return deptrepos.save(db);
    }

    @Override
    public department patdept(Long deptid, String deptname) {
        department db=deptrepos.findById(deptid).get();
        db.setDepartmentname(deptname);
        return deptrepos.save(db);
    }

    @Override
    public List<department> getdeptn(String deptname) {
        return deptrepos.findAllBydepartmentnameIgnoreCase(deptname);
    }


}
