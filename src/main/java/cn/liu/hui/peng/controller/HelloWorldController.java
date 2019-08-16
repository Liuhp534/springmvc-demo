package cn.liu.hui.peng.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @description: hello controller
 * @author: liuhp534
 * @create: 2018-12-23 14:04
 */
@Controller
@RequestMapping(path="helloWorld")
public class HelloWorldController implements EnvironmentAware {

    private final Log logger = LogFactory.getLog(getClass());

    private Environment environment;
    
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
        logger.info("处理中。 。 。   。 。      。");
        System.out.println("good job!!!!");
        return "helloWorld";
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
