package Jutils.test;

/**
 * 作者：张风捷特烈
 * 时间：2018/8/25 0025:10:16
 * 邮箱：1981462002@qq.com
 * 说明：耗时测试类
 */
public abstract class TimeTest {




    public TimeTest() {
        this("", 1);
    }

    public TimeTest(String str) {
        this(str, 1);
    }

    public TimeTest(int count) {
        this("", count);
    }

    public TimeTest(String str, int count) {
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            run();
        }
        long endTime = System.nanoTime();
        System.out.println(str + "方法耗时:" + (endTime - startTime) / 1e9 + "秒");
    }

    protected abstract void run();
}
