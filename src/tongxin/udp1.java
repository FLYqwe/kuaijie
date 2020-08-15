package tongxin;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udp1 {
    public static void main(String[] args) throws IOException {
        //创建接收端socket对象(DatagramSocket)并指定端口

        DatagramSocket ds=new DatagramSocket(10086);
        while(true) {
            //创建一个数据包，用于接收数据
            // 接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //调用socket对象接受数据
            ds.receive(dp);

            //解析数据包
            byte[] datas = dp.getData();
            int len = dp.getLength();//获取接受数据长度
            String da = new String(datas, 0, len);
            System.out.println("数据是" + da);
            

        }
        //关闭接收端
        //ds.close();
    }
}
