package cn.tx.dep.dao;

import cn.tx.model.Dep;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepDao {


    int addDep(Dep record);

    Dep findById(Integer deptno);

    List<Dep> findAll();

}