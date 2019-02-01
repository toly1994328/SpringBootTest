package toly1994.com.toly01.bean;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/16:13:20
 * 邮箱：1981462002@qq.com
 * 说明：Sword的bean对象
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Sword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String info;
    private String imgurl;
    private Date create_time;
    private Date modify_time;
    private String origin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                ", origin='" + origin + '\'' +
                '}';
    }
}
