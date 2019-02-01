package toly1994.com.toly01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import toly1994.com.toly01.bean.Sword;
import toly1994.com.toly01.hander.result.ResultBean;
import toly1994.com.toly01.hander.result.ResultHandler;
import toly1994.com.toly01.repository.SwordRepository;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/16:13:34
 * 邮箱：1981462002@qq.com
 * 说明：
 */
@RestController
@RequestMapping(value = "/api")
public class SwordRestfulController {
    @Autowired
    private SwordRepository mSwordRepository;
/////////////////////////////////////////查询--------------------------------

    /**
     * 查询所有：GET http://localhost:8080/api/sword
     *
     * @return 查询所有
     */
    @GetMapping(value = "/sword")
    public ResultBean findAllToJson() {
        return ResultHandler.ok(mSwordRepository.findAll());
    }

    /**
     * 新建一把剑：POST GET http://localhost:8080/api/sword
     *
     * @param sword 剑
     * @return 剑
     */
    @PostMapping(value = "/sword")
    public ResultBean addOne(@ModelAttribute Sword sword) {
        Sword save = mSwordRepository.save(sword);
        return ResultHandler.ok(save);
    }


    /**
     * 根据id查询 GET http://localhost:8080/api/sword/26
     *
     * @param id id
     * @return 剑
     */
    @GetMapping(value = "/sword/{id}")
    public ResultBean find(@PathVariable("id") Integer id) {
        return ResultHandler.ok(mSwordRepository.findById(id).get());
    }

    /**
     * 根据id更新  PUT http://localhost:8080/api/sword/40
     *
     * @param id id
     * @return 剑
     */
    @PutMapping(value = "/sword/{id}")
    public ResultBean update(@PathVariable("id") Integer id, @ModelAttribute Sword sword) {
        return ResultHandler.ok(mSwordRepository.save(sword));
    }


    /**
     * 根据id删除 DELETE http://localhost:8080/api/sword/41
     *
     * @param id id
     */
    @DeleteMapping(value = "/sword/{id}")
    public ResultBean insert(@PathVariable("id") Integer id) {
        ResultBean resultBean = find(id);
        mSwordRepository.deleteById(id);
        return resultBean;
    }

    /**
     * 根据id查询剑的名称 GET http://localhost:8080/api/sword/21/name
     *
     * @param id id
     * @return 剑
     */
    @GetMapping(value = "/sword/{id}/name")
    public ResultBean findName(@PathVariable("id") Integer id) {
        return ResultHandler.ok(mSwordRepository.findById(id).get().getName());
    }


}
