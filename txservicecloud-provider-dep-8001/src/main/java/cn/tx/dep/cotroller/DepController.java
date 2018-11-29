package cn.tx.dep.cotroller;

import cn.tx.dep.service.DepService;
import cn.tx.model.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author laowang
 * @date 2018/11/29 9:19 AM
 * @Description:
 */

@RestController
public class DepController {

    @Autowired
    DepService depService;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public int add(@RequestBody Dep dep) {
        return depService.addDep(dep);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dep add(@PathVariable("id") Integer id) {
        return depService.findById(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dep> add() {
        return depService.findAll();
    }
}
