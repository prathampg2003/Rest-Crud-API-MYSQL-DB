package com.springpratham.bootspringpra.service;

import com.springpratham.bootspringpra.entity.department;

import java.util.List;

public interface deptservice {
    public department savedepartment(department depat);
    public List<department> fetchdepartment();

    public department fetchdepartmentid(Long departmentid);

    public void deletedepartmentid(Long deptid);

    public department updatedept(Long deptid, department dept);

    public department patdept(Long deptid, String deptid1);

    public List<department> getdeptn(String deptname);
}
