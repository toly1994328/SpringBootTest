package toly1994.com.toly01.repository;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/16:13:33
 * 邮箱：1981462002@qq.com
 * 说明：Sword 对象仓储
 */

import org.springframework.data.jpa.repository.JpaRepository;
import toly1994.com.toly01.bean.Sword;

import java.util.List;

public interface SwordRepository extends JpaRepository<Sword, Integer> {
    //通过name查询
    public List<Sword> findByName(String name);


}