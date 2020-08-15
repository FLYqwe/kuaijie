package tongxin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class udp {
    public static void main(String[] args) throws IOException {

        //创建发送端socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //录入键盘数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            byte[] bys = line.getBytes();
            //打印数据包
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.102"), 10086);
            //调用socket对象发送数据包
            ds.send(dp);


        }
        //关闭发送端
        ds.close();
    }
}
