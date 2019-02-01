package toly1994.com.toly01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import toly1994.com.toly01.hander.result.ResultBean;
import toly1994.com.toly01.hander.result.ResultHandler;
import toly1994.com.toly01.repository.SwordRepository;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/15:21:53
 * 邮箱：1981462002@qq.com
 * 说明：结果返回统一化控制器
 */

@RestController
public class ResultUnitController {
    @Autowired
    private SwordRepository mSwordRepository;

    /**
     * 查询所有：返回json字符串
     *
     * @return
     */
    @GetMapping(value = "/swords/findall")
    public ResultBean findAllToJson() {
        return ResultHandler.ok(mSwordRepository.findAll());
    }
}

