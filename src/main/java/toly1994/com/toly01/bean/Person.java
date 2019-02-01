package toly1994.com.toly01.bean;

import javax.persistence.Entity;

/**
 * 作者：张风捷特烈
 * 时间：2018/10/16 0016:9:56
 * 邮箱：1981462002@qq.com
 * 说明：
 */
public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
