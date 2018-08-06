package priv.augus.logback;

/**
 * IntelliJ IDEA
 *
 * @author Augus
 * @date 2018/8/6
 */
public class DealRealData implements Runnable {
    Thread thrd = null;
    //线程运行标记
    private static boolean bRunning = false;

    // 启动线程
    public boolean start()
    {
        if (thrd != null)
        {
            return true;
        }
        DealRealData ds1 = new DealRealData();
        bRunning = true;
        thrd = new Thread(ds1);
        thrd.start();
        return true;
    }

    @Override
    public void run() {
        System.out.println("1");
    }

    public static void main(String[] args) {
        new DealRealData().start();
    }
}
