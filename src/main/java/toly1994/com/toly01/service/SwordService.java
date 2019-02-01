package toly1994.com.toly01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toly1994.com.toly01.bean.Sword;
import toly1994.com.toly01.repository.SwordRepository;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/16:15:31
 * 邮箱：1981462002@qq.com
 * 说明：业务需求：解连双剑必须同时插入成功或失败
 */
@Service
public class SwordService {
    @Autowired
    private SwordRepository mSwordRepository;

    @Transactional
    public void insertTwo() {
        Sword jie = new Sword();
        jie.setName("解剑");
        jie.setInfo("幻将录--何解莲");
        mSwordRepository.save(jie);

        Sword lian = new Sword();
        lian.setName("连剑");
        //在这故意给个异常看看结果
        jie.setInfo("幻将录--何解莲" + 1 / 0);
        mSwordRepository.save(lian);
    }
}
