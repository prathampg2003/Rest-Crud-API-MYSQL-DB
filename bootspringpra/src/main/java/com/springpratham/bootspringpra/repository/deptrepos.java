package com.springpratham.bootspringpra.repository;

import com.springpratham.bootspringpra.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//jpa repostitory is a repository which gives us all the functions to use such as findall findbyid etc.
@Repository
public interface deptrepos extends JpaRepository<department,Long> {
        public department findBydepartmentname(String dptname);
        public List<department> findAllBydepartmentnameIgnoreCase(String dptname);
        //we can add queries too for searching and all
}
