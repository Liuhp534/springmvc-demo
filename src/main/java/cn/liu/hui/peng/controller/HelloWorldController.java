package cn.liu.hui.peng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: hello controller
 * @author: liuhp534
 * @create: 2018-12-23 14:04
 */
@Controller
@RequestMapping(path="helloWorld")
public class HelloWorldController {
    
    /**
    * @Description: 
    *
    *
    *
    * @param 
    * @return 
    * @throws
    * @author Liuhp534
    * @date 2018/12/23 14:21
    */
    @RequestMapping(path="test")
    public String test() {

        return "helloWorld";
    }
}
