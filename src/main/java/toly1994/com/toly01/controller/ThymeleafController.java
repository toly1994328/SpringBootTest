package toly1994.com.toly01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import toly1994.com.toly01.bean.Sword;
import toly1994.com.toly01.repository.SwordRepository;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/16:16:08
 * 邮箱：1981462002@qq.com
 * 说明：Thymeleaf模板引擎控制器
 */
@Controller //注意由于是RequestBody 所以这里将@RestController拆分出来了
public class ThymeleafController {

    @GetMapping("/HelloThymeleaf")
    public String say() {
        return "index";
    }

    @GetMapping("/useData")
    public String useData(ModelMap map) {
        map.addAttribute("replace_text", "张风捷特烈");
        return "index";
    }

    @GetMapping("/uploadFile")
    public String upload(ModelMap map) {
        return "upfile";
    }

}
