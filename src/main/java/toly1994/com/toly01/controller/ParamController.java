package toly1994.com.toly01.controller;

import Jutils.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import toly1994.com.toly01.properties.MonsterProperties;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/16:8:57
 * 邮箱：1981462002@qq.com
 * 说明：参数测试类
 */
@RestController
public class ParamController {

    ////------get方式Url传参
    @GetMapping({"/id/{the_Param}"})
    public String id(@PathVariable("the_Param") Integer id) {
        return "id:" + id;
    }

    ////------get方式Url传参
    @GetMapping("/user")
    public String username(@RequestParam("username") String str) {
        return "username is:" + str;
    }

    ////------get方式Url传参+默认参数
    @GetMapping("/user_default")
    public String usernameWithDefaultParam(
            @RequestParam(value = "username", defaultValue = "toly1994")
                    String str) {
        return "username is:" + str;
    }

    @PostMapping("/postWithBody")
    public String postWithBody(@RequestParam(value = "name") String str) {
        System.out.println(str);
        return str;
    }



    ////------配置文件字段使用
    @Value("${name}")
    private String lever;
    @Value("${atk}")
    private int atk;
    @Value("${desc}")
    private String desc;

    @GetMapping("/YoGiOh")
    public String paramInRes() {
        return desc;
    }

    ////-----获取配置文件组成员
    @RestController
    public class HelloSpringBoot {
        @Autowired //自动创建对象
        private MonsterProperties monster;

        @GetMapping("/monster")
        public String say() {
            return "KaiBarBoy1==>" + monster.toString();
        }
    }
}
