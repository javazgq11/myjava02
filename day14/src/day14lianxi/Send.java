package day14lianxi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
	public static void main(String[] args) throws IOException {
		DatagramSocket sendds=new DatagramSocket();
		byte[] buf="的交换机不定vvvvv积分".getBytes();
		DatagramPacket senddp=new DatagramPacket
				(buf, buf.length, InetAddress.getByName("192.168.88.31"),1071);
		sendds.send(senddp);
		System.out.println(senddp.getPort()+"ss");
		System.out.println(sendds.getPort()+"ss");
		sendds.close();
	}
}
