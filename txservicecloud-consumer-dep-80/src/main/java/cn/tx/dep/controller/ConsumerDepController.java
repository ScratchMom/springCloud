package cn.tx.dep.controller;

import cn.tx.model.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author laowang
 * @date 2018/11/29 9:49 AM
 * @Description:
 */
@RestController
public class ConsumerDepController {

    private static final String REST_URL_PREFIX = "http://TXSERVICECLOUD-PROVIDER-DEP";

    @Autowired
    RestTemplate restTemplate;

    /**
     * 使用restTemplate访问restful接口非常的简单粗暴无脑，
     * {url,requestMap,ResponseBean.class}这三个参数分别代表
     * REST请求地址，请求参数，HTTP响应转换被转换成的对象类型
     * @param dep
     * @return
     */

    @RequestMapping(value = "/consumer/dept/add",method = RequestMethod.POST)
    public int add(Dep dep) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add",dep,Integer.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dep add(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id,Dep.class);
    }

    @RequestMapping(value = "/consumer/dept/list",method = RequestMethod.GET)
    public List<Dep> add() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list" ,List.class);
    }

}
