package cn.tx.dep.service.impl;

import cn.tx.dep.dao.DepDao;
import cn.tx.dep.service.DepService;
import cn.tx.model.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author laowang
 * @date 2018/11/29 9:15 AM
 * @Description:
 */

@Service
public class DepServiceImpl implements DepService {

    @Autowired
    DepDao depDao;

    @Override
    public int addDep(Dep record) {
        return depDao.addDep(record);
    }

    @Override
    public Dep findById(Integer deptno) {
        return depDao.findById(deptno);
    }

    @Override
    public List<Dep> findAll() {
        return depDao.findAll();
    }
}
