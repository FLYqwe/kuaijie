package tongxin;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //构建数据包
        byte[] bys = "hello,udp,我来啦".getBytes();
        int leng = bys.length;
        InetAddress address = InetAddress.getByName("192.168.1.104");//获取ip地址
        int port = 10081;
        DatagramPacket dp = new DatagramPacket(bys, leng, address, port);

        //一步到位：DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.106"),10086);
        //调用socket对象发送数据包
        ds.send(dp);

        //关闭发送端
        ds.close();
    }
}
