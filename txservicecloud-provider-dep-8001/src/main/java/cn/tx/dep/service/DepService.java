package cn.tx.dep.service;

import cn.tx.model.Dep;

import java.util.List;

/**
 * @author laowang
 * @date 2018/11/29 9:07 AM
 * @Description:
 */
public interface DepService {

    int addDep(Dep record);

    Dep findById(Integer deptno);

    List<Dep> findAll();
}
