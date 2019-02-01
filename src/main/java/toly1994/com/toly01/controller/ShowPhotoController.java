package toly1994.com.toly01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import toly1994.com.toly01.bean.Sword;
import toly1994.com.toly01.repository.SwordRepository;

import javax.servlet.http.HttpServletResponse;
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
public class ShowPhotoController {

    @GetMapping("/show")
    public String swordList(Model model) {
        model.addAttribute("sword", new Sword());
        return "SwordList";
    }

    @GetMapping("/add_form")
    public String greetingForm(Model model) {
        model.addAttribute("sword", new Sword());
        return "submit";
    }

    @Autowired
    private SwordRepository mSwordRepository;

    @PostMapping("/submit_form")
    public void greetingSubmit(@ModelAttribute Sword sword, HttpServletResponse response,
                               @RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return;
        }
        String fileName = file.getOriginalFilename();//获取名字
        String path = "F:/SpringBootFiles/Image";
        File dest = new File(path + "/" + fileName);
        if (!dest.getParentFile().exists()) { //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            sword.setImgurl("http://localhost:8080/imgs/" + fileName);
            sword.setCreate_time(new Date());
            sword.setModify_time(new Date());
            mSwordRepository.save(sword);
            response.sendRedirect("/show");//重定向到展示页
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
