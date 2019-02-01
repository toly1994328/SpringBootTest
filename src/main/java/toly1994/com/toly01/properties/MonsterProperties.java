package toly1994.com.toly01.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/16:9:44
 * 邮箱：1981462002@qq.com
 * 说明：monster Bean 对象
 */
@Component //org.springframework.stereotype.Component;
@ConfigurationProperties(prefix = "monster")
public class MonsterProperties {
    private String name;
    private int atk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "MonsterProperties{" +
                "name='" + name + '\'' +
                ", atk=" + atk +
                '}';
    }
}