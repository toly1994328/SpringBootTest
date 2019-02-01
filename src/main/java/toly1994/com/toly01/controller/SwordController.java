package toly1994.com.toly01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import toly1994.com.toly01.bean.Sword;
import toly1994.com.toly01.repository.SwordRepository;
import toly1994.com.toly01.service.SwordService;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/16:13:34
 * 邮箱：1981462002@qq.com
 * 说明：
 */
@RestController
public class SwordController {
    @Autowired
    private SwordRepository mSwordRepository;
/////////////////////////////////////////查询--------------------------------

    /**
     * 查询所有：返回json字符串:http://192.168.10.104:8080/swords
     *
     * @return
     */
    @GetMapping(value = "/swords")
    public List<Sword> findAllToJson() {
        return mSwordRepository.findAll();
    }

    /**
     * 根据id查询:http://192.168.10.104:8080/swords/21
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/swords/{id}")
    public Sword find(@PathVariable("id") Integer id) {
        return mSwordRepository.findById(id).get();
    }



    /**
     * 根据id查询:http://192.168.10.104:8080/swords/21
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/swords/id")
    public Sword findById(@RequestParam("id") Integer id) {
        return mSwordRepository.findById(id).get();
    }

    /**
     * 根据id查询:http://192.168.10.104:8080/swords/21
     *
     * @param id
     * @return
     */
    @PostMapping(value = "/swords/id")
    public Sword findByIdPost(@RequestParam("id") Integer id) {
        return mSwordRepository.findById(id).get();
    }


    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @PostMapping(value = "/swords/postFind")
    public Sword postFind(@RequestParam(value = "id") Integer id) {
        System.out.println(id);

        return mSwordRepository.findById(id).get();
    }


    /**
     * 根据name查询
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/swords/name/{name}")
    public List<Sword> findByAtk(@PathVariable("name") String name) {
        return mSwordRepository.findByName(name);
    }

/////////////////////////////////////////添加--------------------------------

    /**
     * 添加：返回插入对象的json字符串
     *
     * @return
     */
    @GetMapping(value = "/swords/insert")
    public Sword insert() {
        Sword sword = new Sword();
        sword.setInfo("《犬夜叉》杀生丸配件，初时是一把不能杀此世之物的治愈之刀，" +
                "属于彼世之刀，是刀刀斋用犬大将(斗牙王)的獠牙所打造的剑，" +
                "可通过斩杀冥界的使者令死者复活。" +
                "若是以真正的慈悲心使之发动，一挥刀能拯救百命");
        sword.setName("天生牙");
        sword.setOrigin("《犬夜叉》--杀生丸");
        sword.setCreate_time(new Date());
        sword.setModify_time(new Date());
        return mSwordRepository.save(sword);
    }

    /**
     * 添加：通过url传值构建对象
     *
     * @return
     */
    @GetMapping(value = "/swords/insert2")
    public Sword insert2(Sword sword) {
        return mSwordRepository.save(sword);
    }
/////////////////////////////////////////更新--------------------------------

    /**
     * 更新
     *
     * @return
     */
    @GetMapping(value = "/swords/updata/{id}")
    public Sword updata(Sword sword) {
        return mSwordRepository.save(sword);
    }

    /**
     * 根据id删除
     *
     * @param id
     */
    @GetMapping(value = "/swords/delete/{id}")
    public void insert(@PathVariable("id") Integer id) {
        mSwordRepository.deleteById(id);
    }

    @Autowired
    private SwordService mSwordService;

    /**
     * 查询所有：返回json字符串
     *
     * @return
     */
    @GetMapping(value = "/swords/insert_two")
    public void insertTwo() {
        mSwordService.insertTwo();
    }

    @PostMapping("/postString")
    public String postString(HttpServletRequest request) {
        ServletInputStream is = null;
        try {
            is = request.getInputStream();
            StringBuilder sb = new StringBuilder();
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = is.read(buf)) != -1) {
                sb.append(new String(buf, 0, len));
            }
            System.out.println(sb.toString());
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
